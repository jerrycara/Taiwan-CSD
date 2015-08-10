using System;
using NUnit;
using NUnit.Framework;
using System.Collections.Generic;

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
    }
}
