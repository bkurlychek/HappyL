package com.happyl

class Property {
    static belongsTo = [landlord: Landlord]
    static hasMany = [units:Unit, tenants:Tenant] 
    //byte[] photo
    String address
    String city
    String state
    String zipCode
    String heating 
    
	
	
    static constraints = {
        address(blank: false)
        city(blank: false)
        state(blank: false, 
            inList: ["Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", 
                    "Delaware","District of Columbia", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", 
                    "Indiana", "Iowa","Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", 
                    "Michigan", "Minnesota","Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", 
                    "New Hampshire", "New Jersey", "New Mexico","New York", "North Carolina", "North Dakota",
                    "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island","South Carolina", 
                    "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington",
                    "West Virginia", "Wisconsin", "Wyoming" ])
        //photo(maxSize: 4096, nullable: true)
         zipCode( blank: false, matches: /^\d{5}/)
         heating()
         
       
    }
    String toString(){
        " ${address} "
    }
    
}
