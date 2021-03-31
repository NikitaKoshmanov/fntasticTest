fun main(args: Array<String>) {
    val input = readLine()
    var empty = ""
    var count = 0
    if(input != null) {
        val str = input.toLowerCase().toCharArray()
        var result = empty.padEnd(str.size, '(').toCharArray()
        for(i in 0 until str.size){
            var flag = str[i]
            for(j in i+1 until str.size){
                if(str[j] == flag){
                    result[j] = ')'
                    ++count
                }
                if(count > 0) result[i] = ')'
                count = 0
            }
        }
        println(result)
    }

}