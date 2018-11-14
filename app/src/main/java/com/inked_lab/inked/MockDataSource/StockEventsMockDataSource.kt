package com.inked_lab.inked.MockDataSource

import com.inked_lab.inked.Models.StockCalendarEventModel
import java.util.*


object StockEventsMockDataSource{

    val StockEvent_1 = StockCalendarEventModel("1").apply {
        eventName = "남북 정상 회담"
        incidentContent = "청와대는 다음달 1일 김정은 최고 수령자와 문대통령과의 회담일정을 발표했다. 이번회담에서는 비핵화에대한 구채적 합의와 DMZ 활용방안에 대한 예기가 주를 이를것으로 예상된다."
        incidentDate = Calendar.getInstance().time
    }


    val AllStockEvents = mutableListOf<StockCalendarEventModel>(
            StockEvent_1,
            StockEvent_1,
            StockEvent_1
    )
}
