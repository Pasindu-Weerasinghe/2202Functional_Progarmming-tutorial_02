package tutorial_02

object Q04_a {
  def main(args:Array[String]){
    print("Enter employee working hours : ")
    var workh=scala.io.StdIn.readInt()
    print("Enter employee OT hours : ")
    var OT=scala.io.StdIn.readInt()
    
    if((workh>0&&workh<=40)&& (OT>0&&OT<=30)){
      var totalsalary=calsalary(workh,OT)
      println("Take home salary : "+totalsalary)
    }
    else{
       println("work hours or OT hours are Invalid ")
    }
  }
  
  def calsalary(workh:Int,OT:Int):Int={
    var salary=(workh*250+OT*85)*0.88F
    var totalsalary=salary.toInt
    return totalsalary
  }
}