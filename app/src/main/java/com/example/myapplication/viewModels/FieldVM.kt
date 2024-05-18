package com.example.myapplication.viewModels

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.myapplication.R
import com.example.myapplication.data.Field

class FieldVM : ViewModel() {
    var fields = mutableStateListOf<Field>()
        private set
    var defaultDesc = "I get out my records When you go away When people are talking I miss what they say 'Cause it all means nothing, my dear If I can't be holding you near So tell me you love me 'Cause that's all that I need to hear I sit in my kitchen (George, do the hi-hats now) With nothing to eat With so many friends I I don't want to meet 'Cause I don't need music in my ears I don't need the crowds and the cheers Oh, just tell me you love me 'Cause that's all that I need to hear I've been told so many times before But hearing it from you means much more So much more Reply to my message And pick up my calls You see, I wrote you a letter It was no use at all Oh, I don't care if you're insincere Just tell me what I want to hear You know where to find me The place where we lived all these years, oh And tell me you love me That's all that I need to hear Oh, tell me you love me That's all that I need to hear"
    init {
        // Initialize with sample data
        fields.addAll(
            listOf(
                // Futsal
                Field(1, "Lapangan Majapahit", "Futsal", 50.0, 4.5f, location = 17.9f, defaultDesc, R.drawable.futsal),
                Field(2, "Lapangan Gym Bro", "Futsal", 60.0, 4.2f, location = 17.9f, defaultDesc,  R.drawable.futsal1),
                Field(3, "Lapangan Mantappu", "Futsal", 70.0, 4.8f, location = 17.9f, defaultDesc,  R.drawable.futsal2),
                Field(4, "Lapangan Orang Utan", "Futsal", 50.0, 4.5f, location = 17.9f, defaultDesc, R.drawable.futsal3),
                Field(5, "Lapangan Gen Halilintar", "Futsal", 60.0, 4.2f, location = 17.9f, defaultDesc,  R.drawable.futsal4),
                Field(6, "Lapangan Haji Ahmad", "Futsal", 70.0, 4.8f, location = 17.9f, defaultDesc,  R.drawable.futsal5),
                Field(7, "Lapangan Petir", "Futsal", 50.0, 4.5f, location = 17.9f, defaultDesc, R.drawable.futsal6),
                Field(8, "Lapangan Betingkah", "Futsal", 60.0, 4.2f, location = 17.9f, defaultDesc,  R.drawable.futsal7),
                Field(9, "Lapangan Gebuk", "Futsal", 70.0, 4.8f, location = 17.9f, defaultDesc,  R.drawable.futsal8),

                // Badminton
                Field(10, "Lapangan Sutet", "Badminton", 40.0, 4.0f,location = 17.9f,defaultDesc,  R.drawable.badmin),
                Field(11, "Lapangan Listrik", "Badminton", 45.0, 4.3f,location = 17.9f,defaultDesc,  R.drawable.badmin2),
                Field(12, "Lapangan Gaya", "Badminton", 50.0, 4.7f,location = 17.9f,defaultDesc,  R.drawable.badmin3),
                Field(13, "Lapangan Geprek Bensu", "Badminton", 40.0, 4.0f,location = 17.9f,defaultDesc,  R.drawable.badmin4),
                Field(14, "Lapangan Penyetan Abang Opa", "Badminton", 45.0, 4.3f,location = 17.9f,defaultDesc,  R.drawable.badmin5),
                Field(15, "Lapangan Pak de slamet", "Badminton", 50.0, 4.7f,location = 17.9f,defaultDesc,  R.drawable.badmin6),
                Field(16, "Lapangan Orang Utan", "Badminton", 40.0, 4.0f,location = 17.9f,defaultDesc,  R.drawable.badmin7),
                Field(17, "Lapangan Block", "Badminton", 45.0, 4.3f,location = 17.9f,defaultDesc,  R.drawable.badmin8),
                Field(18, "Lapangan I am mantap", "Badminton", 50.0, 4.7f,location = 17.9f,defaultDesc,  R.drawable.badmin8),
                // Minsoc (Mini Soccer)
                Field(19, "Minsoc Field 1", "Minsoc", 70.0, 4.5f,location = 17.9f,defaultDesc,  R.drawable.minsoc),
                Field(21, "Minsoc Field 2", "Minsoc", 80.0, 4.2f,location = 17.9f,defaultDesc,  R.drawable.minsoc),
                Field(22, "Minsoc Field 3", "Minsoc", 90.0, 4.8f,location = 17.9f,defaultDesc,  R.drawable.minsoc),
                Field(23, "Minsoc Field 1", "Minsoc", 70.0, 4.5f,location = 17.9f,defaultDesc,  R.drawable.minsoc),
                Field(24, "Minsoc Field 2", "Minsoc", 80.0, 4.2f,location = 17.9f,defaultDesc,  R.drawable.minsoc),
                Field(25, "Minsoc Field 3", "Minsoc", 90.0, 4.8f,location = 17.9f,defaultDesc,  R.drawable.minsoc),
                Field(26, "Minsoc Field 1", "Minsoc", 70.0, 4.5f,location = 17.9f,defaultDesc,  R.drawable.minsoc),
                Field(27, "Minsoc Field 2", "Minsoc", 80.0, 4.2f,location = 17.9f,defaultDesc,  R.drawable.minsoc),
                Field(28, "Minsoc Field 3", "Minsoc", 90.0, 4.8f,location = 17.9f,defaultDesc,  R.drawable.minsoc),
                // Volleyball
                Field(29, "Volleyball Court 1", "Voli", 50.0, 4.5f,location = 17.9f,defaultDesc,  R.drawable.voli),
                Field(30, "Volleyball Court 2", "Voli", 60.0, 4.2f,location = 17.9f,defaultDesc,  R.drawable.voli),
                Field(31, "Volleyball Court 3", "Voli", 70.0, 4.8f,location = 17.9f,defaultDesc,  R.drawable.voli),
                Field(32, "Volleyball Court 1", "Voli", 50.0, 4.5f,location = 17.9f,defaultDesc,  R.drawable.voli),
                Field(33, "Volleyball Court 2", "Voli", 60.0, 4.2f,location = 17.9f,defaultDesc,  R.drawable.voli),
                Field(34, "Volleyball Court 3", "Voli", 70.0, 4.8f,location = 17.9f,defaultDesc,  R.drawable.voli),
                Field(35, "Volleyball Court 1", "Voli", 50.0, 4.5f,location = 17.9f,defaultDesc,  R.drawable.voli),
                Field(36, "Volleyball Court 2", "Voli", 60.0, 4.2f,location = 17.9f,defaultDesc,  R.drawable.voli),
                Field(37, "Volleyball Court 3", "Voli", 70.0, 4.8f,location = 17.9f,defaultDesc,  R.drawable.voli),
                // Billiard
                Field(20, "Billiard Table 1", "Billiard", 20.0, 4.5f,location = 17.9f,defaultDesc,  R.drawable.biliard),
                Field(38, "Billiard Table 2", "Billiard", 25.0, 4.2f,location = 17.9f,defaultDesc,  R.drawable.biliard),
                Field(39, "Billiard Table 3", "Billiard", 30.0, 4.8f,location = 17.9f,defaultDesc,  R.drawable.biliard),
                Field(40, "Billiard Table 1", "Billiard", 20.0, 4.5f,location = 17.9f,defaultDesc,  R.drawable.biliard),
                Field(41, "Billiard Table 2", "Billiard", 25.0, 4.2f,location = 17.9f,defaultDesc,  R.drawable.biliard),
                Field(42, "Billiard Table 3", "Billiard", 30.0, 4.8f,location = 17.9f,defaultDesc,  R.drawable.biliard),
                Field(43, "Billiard Table 1", "Billiard", 20.0, 4.5f,location = 17.9f,defaultDesc,  R.drawable.biliard),
                Field(44, "Billiard Table 2", "Billiard", 25.0, 4.2f,location = 17.9f,defaultDesc,  R.drawable.biliard),
                Field(45, "Billiard Table 3", "Billiard", 30.0, 4.8f,location = 17.9f,defaultDesc,  R.drawable.biliard),

                // Tennis
                Field(46, "Tennis Court 1", "Tennis", 80.0, 4.5f,location = 17.9f,defaultDesc,  R.drawable.tennis),
                Field(47, "Tennis Court 2", "Tennis", 90.0, 4.2f,location = 17.9f,defaultDesc,  R.drawable.tennis),
                Field(48, "Tennis Court 3", "Tennis", 100.0, 4.8f,location = 17.9f,defaultDesc,  R.drawable.tennis),
                Field(49, "Tennis Court 1", "Tennis", 80.0, 4.5f,location = 17.9f,defaultDesc,  R.drawable.tennis),
                Field(50, "Tennis Court 2", "Tennis", 90.0, 4.2f,location = 17.9f,defaultDesc,  R.drawable.tennis),
                Field(51, "Tennis Court 3", "Tennis", 100.0, 4.8f,location = 17.9f,defaultDesc,  R.drawable.tennis),
                Field(52, "Tennis Court 1", "Tennis", 80.0, 4.5f,location = 17.9f,defaultDesc,  R.drawable.tennis),
                Field(53, "Tennis Court 2", "Tennis", 90.0, 4.2f,location = 17.9f,defaultDesc,  R.drawable.tennis),
                Field(54, "Tennis Court 3", "Tennis", 100.0, 4.8f,location = 17.9f,defaultDesc,  R.drawable.tennis),
                // Golf
                Field(55, "Golf Course 1", "Golf", 150.0, 4.5f,location = 17.9f,defaultDesc,  R.drawable.golf),
                Field(56, "Golf Course 2", "Golf", 200.0, 4.2f,location = 17.9f,defaultDesc,  R.drawable.golf),
                Field(57, "Golf Course 3", "Golf", 250.0, 4.8f,location = 17.9f,defaultDesc,  R.drawable.golf),
                Field(58, "Golf Course 1", "Golf", 150.0, 4.5f,location = 17.9f,defaultDesc,  R.drawable.golf),
                Field(59, "Golf Course 2", "Golf", 200.0, 4.2f,location = 17.9f,defaultDesc,  R.drawable.golf),
                Field(60, "Golf Course 3", "Golf", 250.0, 4.8f,location = 17.9f,defaultDesc,  R.drawable.golf),
                Field(61, "Golf Course 1", "Golf", 150.0, 4.5f,location = 17.9f,defaultDesc,  R.drawable.golf),
                Field(62, "Golf Course 2", "Golf", 200.0, 4.2f,location = 17.9f,defaultDesc,  R.drawable.golf),
                Field(63, "Golf Course 3", "Golf", 250.0, 4.8f,location = 17.9f,defaultDesc,  R.drawable.golf)

            )
        )
    }
    // Function to get fields by category
    fun getFieldsByCategory(category: String): List<Field> {
        return fields.filter { it.category == category }
    }

    // Function to get field by ID
    fun getFieldById(id: Int): Field? {
        return fields.find { it.id == id }
    }
}