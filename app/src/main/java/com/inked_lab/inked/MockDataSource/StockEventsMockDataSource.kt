package com.inked_lab.inked.MockDataSource

import com.inked_lab.inked.Models.StockEventModel
import java.util.*


val StockEvent_1 = StockEventModel("1").apply {
    eventName = "남북 정상 회담"
    eventContent = "청와대는 다음달 1일 김정은 최고 수령자와 문대통령과의 회담일정을 발표했다. 이번회담에서는 비핵화에대한 구채적 합의와 DMZ 활용방안에 대한 예기가 주를 이를것으로 예상된다."
    eventTime = Date("2018.10.01")
}


val AllStockEvents = mutableListOf<StockEventModel>(
        StockEvent_1
)