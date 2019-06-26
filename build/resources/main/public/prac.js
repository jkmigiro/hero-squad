function f(n) {
    if(n==2 || n==3 || n==5 || n==7 || n==11 ||n==13){
        console.log("prime at first")
        return true;
    }else if(n%2==0 || n%3==0 || n%5==0 || n%7==0||n%9==0||n%11==0||n%13==0 ){
        console.log("Not prime")
        return false
    }else{


    }

}

// if(n%(i*j)==0){
//
//
//     console.log("Not prime")
//     return false
// }else {
//     continue
// }
//

for(var i=1;i<=23;i++){
    for(var j=1;j<=23;j++ ){
        console.log(" I is",i," and j is ",j,"=",(i*j));
        if(23%(i*j)==0){
            console.log("Not prime number is",i*j)
            break
        }

    }


    console.log("prime at end")

}
