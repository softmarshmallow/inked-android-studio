package com.inked_lab.inked.CustomViews

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import com.inked_lab.inked.Models.KRXStockCompanyModel
import com.inked_lab.inked.R
import com.inked_lab.inked.WebServices.LiveNewsService
import com.inked_lab.inked.WebServices.LiveStockPriceService.GetLivePrice
import kotlinx.android.synthetic.main.customview_live_stock_price.view.*
import java.util.*
import kotlin.concurrent.fixedRateTimer
import kotlin.concurrent.timerTask
import com.thefinestartist.finestwebview.FinestWebView



class LiveStockPriceView : ConstraintLayout {
    val TAG = "LiveStockPriceView"
    val UPDAT_RATE = 10000 // 10 sec

    private var _companyCode: String = "005930"

    lateinit var compData: KRXStockCompanyModel

    var companyCode: String
        get() = _companyCode
        set(value) {
            _companyCode = value
            subscribe()
        }

    constructor(context: Context) : super(context) {
        init(null, 0)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(attrs, 0)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init(attrs, defStyle)
    }

    private fun init(attrs: AttributeSet?, defStyle: Int) {

        val view = LayoutInflater.from(context)
                .inflate(R.layout.customview_live_stock_price, this, true)

        view.setOnClickListener {
            goToCompanyDetailPage()
        }


        // Load attributes
        val a = context.obtainStyledAttributes(
                attrs, R.styleable.LiveStockPriceView, defStyle, 0)

        if (a.getString(R.styleable.LiveStockPriceView_companyCode) != null){
            companyCode = a.getString(R.styleable.LiveStockPriceView_companyCode)!!
        }

        a.recycle()
        subscribe()
    }

    fun goToCompanyDetailPage(){
        FinestWebView.Builder(context).show(compData.companyInfoUrl)
    }

    fun initUI(){

        compCodeTextView.text = compData.companyCode
        compTextView.text = compData.companyName
        priceTextView.text = compData.currentPrice.toString()
        priceRateText.text = compData.priceRate

        var updownIndicatorColor = ColorDrawable(resources.getColor(R.color.sky_blue))
        var updownIndicatorImage = resources.getDrawable(R.drawable.triangle_down)

        when (compData.color){
            "red" ->{
                updownIndicatorColor = ColorDrawable(resources.getColor(R.color.salmon))
                updownIndicatorImage = resources.getDrawable(R.drawable.triangle_up)
            }
            "blue" ->{
                updownIndicatorColor = ColorDrawable(resources.getColor(R.color.sky_blue))
                updownIndicatorImage = resources.getDrawable(R.drawable.triangle_down)
            }
        }

        updownMainTagIndicator.setImageDrawable(updownIndicatorColor)
        updownIndicator.setImageDrawable(updownIndicatorImage)

    }


    var fixedRateTimer: Timer? = null

    fun subscribe(){
        fixedRateTimer?.cancel()
        fixedRateTimer?.purge()
        fixedRateTimer = null


        fixedRateTimer = fixedRateTimer(name = "LivePriceUpdate",
                period = LiveNewsService.UPDATE_RATE.toLong()) {
            LiveNewsService.GetLatestNews()
        }
        fixedRateTimer?.scheduleAtFixedRate(timerTask{
            GetLivePrice(companyCode) {
                compData = it
                initUI()
            }
        }, 100, UPDAT_RATE.toLong())
    }


    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        fixedRateTimer?.cancel()
        fixedRateTimer?.purge()
    }

}
