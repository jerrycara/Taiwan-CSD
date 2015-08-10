using System;
using NUnit;
using NUnit.Framework;
using System.Collections.Generic;
using System.Linq;
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
            Place place = new Place(99, "台北羽球館", "08:00", "10:00" , 100, true);
            Places Places = new Places();
            //When
            Places.placeList.Clear();
            Places.placeList.Add(place);
            //Then
            Assert.AreEqual(1, Places.placeList.Count);
            Assert.AreEqual(place, Places.placeList[0]);
        }
        [Test]
        public void Query_PlaceInfo()
        {
            //Give
            Places Places = new Places();

            //When
            Place actual = Places.Query(id: 2).FirstOrDefault();
            Place expected = new Place(2, "新竹羽球館", "08:00", "10:00", 100, true);

            //Then
            Assert.AreSame(expected, actual);
        }

        [Test]
        public void User_Add_Order()
        {
            //Give
            var order = new Order(new Place(1, "台北羽球館", "08:00", "10:00", 100, true));

            //When
            var orderId = order.Create();

            //Then
            order.ToExpectedObject().ShouldEqual(Order.Get(orderId));
        }
    }
}
