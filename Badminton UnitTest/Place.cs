using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;

namespace UnitTestProject1
{
    public class IPlace
    {
    }

    public class Place : IPlace
    {
        public string _address { get; set; }
        
        public bool _avalible { get; set; }
        public string _endTime { get; set; }
        public int _price { get; set; }
        public string _startTime { get; set; }
        public int _id { get; private set; }

        public Place(int id, string address, string startTime, string endTime, int Price, bool avalible)
        {
            this._id = id;
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
            placeList = new List<Place>();
            placeList.Add(new Place(1, "台北羽球館", "08:00", "10:00", 100, true));
            placeList.Add(new Place(2, "新竹羽球館", "08:00", "10:00", 100, true));
            placeList.Add(new Place(3, "台中羽球館", "08:00", "10:00", 100, true));
            placeList.Add(new Place(4, "台東羽球館", "08:00", "10:00", 100, true));
            placeList.Add(new Place(5, "花蓮羽球館", "08:00", "10:00", 100, true));
            placeList.Add(new Place(6, "新北羽球館", "08:00", "10:00", 100, true));
            placeList.Add(new Place(7, "高雄羽球館", "08:00", "10:00", 100, true));
        }
        public IList<Place> placeList { get; set; }

        public IList<Place> Query(int id, string startTime = "08:00", string endTime = "10:00", bool avalible = true)
        {
            return placeList.Where(it=>it._id == id && it._startTime == startTime && it._endTime == endTime && it._avalible == avalible).ToList();
        }
    }
}