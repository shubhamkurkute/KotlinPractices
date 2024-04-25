import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class RangeRegulator(initialValue:Int, private val minValue:Int, private val maxValue:Int):ReadWriteProperty<Any,Int>{
    var fieldData = initialValue
    override fun getValue(thisRef: Any, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: Int) {
        if(fieldData in minValue..maxValue){
            fieldData = value
        }
    }

}