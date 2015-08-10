using System;
using NUnit;
using NUnit.Framework;
using System.Collections.Generic;
using ExpectedObjects;

namespace UnitTestProject1
{
    [TestFixture]
    public class UnitTest1
    {
        [Test]
        public void Manager_Add_PlaceInfo()
        {
            //Give
            Place place = new Place("台北羽球館", "08:00", "10:00" , 100, true);
            Places Places = new Places();
            //When
            Places.place.Add(place);
            //Then
            Assert.AreEqual(1, Places.place.Count);
            Assert.AreEqual(place, Places.place[0]);
        }

        [Test]
        public void User_Add_Order()
        {
            //Give
            var order = new Order(new Place("台北羽球館", "08:00", "10:00", 100, true));

            //When
            var orderId = order.Create();

            //Then
            Assert.AreEqual(order.ToExpectedObject(), Order.Get(orderId));
        }
    }
}
