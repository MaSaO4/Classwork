const express = require('express');
const router = express.Router()
const User = require('../models/User')
const {body,validationResult} = require('express-validator');

router.post("/createuser",[
    body('email','Enter a valid email').isEmail(),,
    body('name').isLength({min:5}),
    body('password','Incorrext password').isLength({min:5})
], async (req, resp) => {

    const errors = validationReslt(req);
    if(!errors.isEmpty()){
        return resp.status(400).json({errors:error.array()});
    }

    try {
        await User.create({
            name: req.body.name,
            email: req.body.email,
            location: req.body.location,
            password: req.body.password,
        })
        resp.json({success:true})

    } catch (error) {
        console.log(error);
        resp.json({success:false})
    }
})

module.exports=router;
