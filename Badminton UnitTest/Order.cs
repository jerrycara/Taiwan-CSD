using System;

namespace UnitTestProject1
{
    internal class Order
    {
        private Place place;

        public Order(Place place)
        {
            this.place = place;
        }

        public object Create()
        {
            return 1;
        }

        public static Order Get(object orderId)
        {
            return new Order(new Place("台北羽球館", "08:00", "10:00", 100, true));
        }
    }
}