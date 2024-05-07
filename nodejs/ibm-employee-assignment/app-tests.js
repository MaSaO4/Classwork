import supertest from "supertest";
import {app} from './index.js';

// describe('it should pass', () => {

//     it('should pass', () => {
//         expect(5 + 5).toBe(10);
//     });

//     it('should succeed login', () => {

//     })

// });

describe('test setup', () => {
    beforeAll();
})

const request = supertest(app);

describe('it should pass',() => {
    it('should succeed login',async () => {
        const res = await request
        .post('/login')
        .send({username:'sonu', password : 'sonu'});
        expect(res.status).toBe(200);
        expect(res.body.message).toBe('Login Successfully');
        expect(res.body.token).toBeTruthy();
    })

    it('should not login',async () => {
        const res = await request
        .post('/login')
        .send({username:'asdf', password : 'asdf'});
        expect(res.status).not.toBe(200);
        expect(res.body.message).toBe('Invalid Credentials');
        // expect(res.body.token).toBeTruthy();
    })
})


// describe();
// it();


// describe(arg1, arg2);
// describe('it should pass', () => { });

// it(a1, a2);
// it('test should pass', () => { });

// describe('it should pass', () => {

//     it();
//     it();
//     it();

// });