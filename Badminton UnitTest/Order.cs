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

        public static Order Get(object orderId)
        {
            return new Order(new Place(1, "台北羽球館", "08:00", "10:00", 100, true));
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