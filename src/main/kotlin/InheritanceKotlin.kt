open class SmartDevices(val name : String , val category:String){

    var deviceStatus  = "Online"
    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }


    open fun turnOn() {
        deviceStatus = "Online"
    }

    open fun turnOff() {
        deviceStatus = "Offline"
    }


}
class SmartTVDevice(deviceName:String , deviceCategory:String):SmartDevices(name = deviceName, category = deviceCategory){

    var speakerVolume by RangeRegulator(20,0,100)
//        set(value) {
//            if (value in 0..100) {
//                field = value
//            }
//        }

    var channelNumber by RangeRegulator(3,1,250)
//        set(value) {
//            if (value in 0..200) {
//                field = value
//            }
//        }

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn(){
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                    "set to $channelNumber."
        )

    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }


}

class SmartHome(val smartTVDevice: SmartTVDevice){

    fun turnOn(){
        smartTVDevice.turnOn()
    }
    fun turnOff(){
        smartTVDevice.turnOff()
    }
    fun increaseTvVolume() {
        smartTVDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTVDevice.nextChannel()
    }
    
}