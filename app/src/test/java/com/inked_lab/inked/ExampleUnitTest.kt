package com.inked_lab.inked

import com.inked_lab.inked.WebServices.StockCalendarService
import com.inked_lab.inked.WebServices.StockCalendarService.GetCalendarEvents
import org.junit.Test

import org.junit.Assert.*
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun ApiTest_1(){
        GetCalendarEvents(StockCalendarService.CalendarRangeType.Monthly, Date(2018, 10, 9),
                {
                    print(it)
                },
                {
                    print(it)
                })
    }
}
