fun returnMaxNoInArray(arr : MutableList<Int>) : Int{
    var maxNo = arr[0]
    for (i in arr) {
        if (maxNo < i){
            maxNo = i
        }
    }
    return maxNo
}

fun returnMinNoInArray(arr : MutableList<Int>) : Int{
    var minNo = arr[0]
    for(i in arr){
        if (minNo > i){
            minNo = i
        }
    }
    return minNo
}

fun returnMaxNum(a : Int, b : Int, c : Int) : Int{
    return if(a>b){
        if (a>c){
            a
        }else{
            c
        }
    }else if (b>c){
        b
    }else{
        c
    }
}