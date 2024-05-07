const mongoose = require("mongoose")
const mongoURI='mongodb://goFood:goFood@ac-aydwauy-shard-00-00.4kh7fgm.mongodb.net:27017,ac-aydwauy-shard-00-01.4kh7fgm.mongodb.net:27017,ac-aydwauy-shard-00-02.4kh7fgm.mongodb.net:27017/goFoodMern?ssl=true&replicaSet=atlas-tfae12-shard-0&authSource=admin&retryWrites=true&w=majority&appName=Cluster0';
const mongoDB = async()=>{    
await mongoose.connect(mongoURI,{useNewUrlParser:true},async(err,result)=>{
        if(err) console.log("---",err)
        else {
            console.log("Connected successfully")
            const fetched_data = await mongoose.connection.db.collection("food_items")
            fetched_data.find({}).toArray(function(err,data){
                if(err) console.log(err)
                else(console.log(data))
            })
    }
    })
}

module.exports = mongoDB;