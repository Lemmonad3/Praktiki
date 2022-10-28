package com.example.praktika15

import android.os.Parcel
import android.os.Parcelable

class Animal():Parcelable{
    private var name: String = ""
    private var age: Int = 0
    private var month: Int = 0
    constructor(parcel: Parcel):this() {
        name = parcel.readString().toString()
        age = parcel.readInt()
        month = parcel.readInt()
    }
    companion object CREATOR : Parcelable.Creator<Animal> {
        override fun createFromParcel(parcel: Parcel): Animal {
            return Animal(parcel)
        }
        override fun newArray(size: Int): Array<Animal?> {
            return arrayOfNulls(size)
        }
    }

    constructor(_name: String, _age: Int, _month: Int): this(){
        name = _name
        month = _month
        age = _age
    }


    fun setName(_name: String){
        name = _name
    }
    fun getName(): String {
        return name
    }
    fun setMonth(_month: Int){
        month = _month
    }
    fun getMonth(): Int {
        return month
    }
    fun setAge(_age: Int){
        age = _age
    }
    fun getAge(): Int {
        return age
    }
    override fun describeContents(): Int {
        return 0
    }
     override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeString(name)
        dest?.writeInt(month)
        dest?.writeInt(age)
    }

}