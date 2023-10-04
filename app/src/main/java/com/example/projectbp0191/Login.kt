class Login {
    var username =""
    var password =""

    fun loginCheck():Boolean{
        if(username.equals("danda")&&password.equals("amikom")){
            return true
        }else{
            return false
        }
    }
}