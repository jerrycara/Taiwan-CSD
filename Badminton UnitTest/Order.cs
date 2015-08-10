using System;
using System.Collections.Generic;

namespace UnitTestProject1
{
    internal class Order
    {
        private static List<Order> orderStore = new List<Order>();
        private Place place;

        public Order(Place place)
        {
            this.place = place;
        }

        public int Create()
        {
            orderStore.Add(this);
            return orderStore.Count;
        }

        public static Order Get(int orderId)
        {
            return orderStore[orderId - 1];
        }
    }
}