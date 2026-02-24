

There was no up-front question when you asked me about the business domain knowledge. 
So, let me share what I know

### Story

What business ametek is doing? 
Ametek is a company making IOT devices/or purchasing iot devices from vendors and selling those devices to it's customers.
We are in business of managing the devices and providing the data to customers.


Why customers need devices?
Customers owns the trucks (for logistics purpose) they are concern about the certain metric data which this devices can provide. 
Metrics include:
- Fuel consumption
- Vehicle location
- Is vehicle running or not ?
- Is vehicle idle or not ?
- How much the truck is loaded ? How much space is left in the truck ? etc...

So, customers need these devices to monitor the trucks and make sure they are running efficiently.
In business language, we call the "trucks" as "assets" and devices are installed on the assets to monitor the assets.

Details about the customers:
1. Customers owns the assets or might be possible they lease their assets to others.So, following are the possible scenarios:
- Customers owns the assets and they are using the devices to monitor their assets.
- Customers owns the assets and they are leasing their assets to others. 
  In this case, customers are using the devices to monitor the assets and also they are sharing the data with the lessees and lessees are also using the data to monitor the assets.

  
Following are 3 entities in our business domain, let understand each of them in detail:
1. Devices
    - There certain types of devices which are used to monitor the assets. So, properties of devices varies. 
2. Assets
    - Assets can be owned,leased-in or leased-out.
    - Assets can be moving or idle. 
3. Customers
    - Customers can be asset owner, lessee (taken assets from other customer on lease) or lessor (given owned assets to other customer on lease).

