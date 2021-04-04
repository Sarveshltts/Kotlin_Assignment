package com.ltts.Assignment.POS

import java.util.*
import kotlin.collections.ArrayList

class Point_of()
{
    var sc= Scanner(System.`in`)
    fun customer()
    {
        print("Enter the customer name: ")
        var name =sc.next()
        print("Enter the customer mobile number: ")
        var mob=sc.nextLong()
        print("Enter the customer address: ")
        var add=sc.next()

        print("Enter the number of items: ")
        var n=sc.nextInt()
        var ls = ArrayList<Any>()
        for(i in 1..n) {
            println("****************Item $i********************")
            print("Enter the Item Id: ")
            var item_id = sc.nextInt()
            print("Enter the Item name: ")
            var it_name = sc.next()
            ls.add(it_name)
            print("Enter the quantity: ")
            var quan = sc.nextInt()
            ls.add(quan)
            print("Enter the price: ")
            var cost = sc.nextInt()
            var total = 0
            total = quan * cost
            ls.add(total.toLong())
        }
        print("**********Details*************")
        println("Customer Name: $name \t Mobile: $mob \n Address: $add \n")
            var sum:Long =0
            for (i in ls)
            {
                when(i){
                    is String -> print("Item name: $i")
                    is Int -> print("     Quantity: $i")
                    is Long -> print("     Price: $i \n")
                }
            }
            for(i in ls)
            {
                when(i)
                {
                    is Long-> sum+=i;
                }
            }
            print("Your total bill is $sum \n Thank you for shopping with us")
    }
}
fun main()
{
    Point_of().customer()

}