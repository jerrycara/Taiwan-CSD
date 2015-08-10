using System.Collections.Generic;

namespace UnitTestProject1
{
    public class IPlace
    {
    }

    public class Place : IPlace
    {
        private string _address;
        private bool _avalible;
        private string _endTime;
        private int _price;
        private string _startTime;

        public Place(string address, string startTime, string endTime, int Price, bool avalible)
        {
            this._address = address;
            this._startTime = startTime;
            this._endTime = endTime;
            this._price = Price;
            this._avalible = avalible;
        }
    }

    public class Places
    {
        public Places()
        {
            place = new List<Place>();    
        }
        public IList<Place> place { get; set; }
    }
}