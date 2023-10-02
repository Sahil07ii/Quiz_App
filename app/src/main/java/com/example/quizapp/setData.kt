package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "How many Yug in one Chaturyug?",

           "12",
           "4",
           "3",
           "7",
           2
       )
       var question2 = QuestionData(
           2,
           "In which yug Shri Ram Born ?",

           "Tretayug",
           "Kaliyug",
           "Dwaparyug",
           "None of the above",
           1
       )
       var question3 = QuestionData(
           3,
           "How many Shlokas in Valmiki Ramayan ?",

           "12907",
           "12900",
           "24000",
           "1000000",
           3
       )
       var question4 = QuestionData(
           4,
           "Who written Hanuman Chalisa ?",

           "Adi Guru Shankaracharya Ji",
           "Goswami Tulsidas Ji",
           "Aryabhatta Ji",
           "Varahamihira",
           2
       )

       var question5 = QuestionData(
           5,
           "Largest Statue in the world is..",

           "Statue of Unity",
           "Spring Temple",
           "Statue of Belief",
           "None of these",
           1
       )

       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       return que
   }
}