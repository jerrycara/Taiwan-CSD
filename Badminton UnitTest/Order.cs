using System;
<<<<<<< HEAD
=======
using System.Collections.Generic;
>>>>>>> c365b4e354777279461bdc1ea8208bb096edaaef

namespace UnitTestProject1
{
    internal class Order
    {
<<<<<<< HEAD
=======
        private static List<Order> orderStore = new List<Order>();
>>>>>>> c365b4e354777279461bdc1ea8208bb096edaaef
        private Place place;

        public Order(Place place)
        {
            this.place = place;
        }

<<<<<<< HEAD
        public object Create()
        {
            return 1;
        }

        public static Order Get(object orderId)
        {
            return new Order(new Place("台北羽球館", "08:00", "10:00", 100, true));
=======
        public int Create()
        {
            orderStore.Add(this);
            return orderStore.Count;
        }

        public static Order Get(int orderId)
        {
            return orderStore[orderId - 1];
>>>>>>> c365b4e354777279461bdc1ea8208bb096edaaef
        }
    }
}