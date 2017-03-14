import java.text.DecimalFormat;

class Parcel {
  public int mWidth;
  public int mHeight;
  public int mLength;
  public int mWeight;
  public int mDistance;

  public Parcel(int length, int width, int height, int weight, int distance) {
    mLength = length;
    mWidth = width;
    mHeight = height;
    mWeight = weight;
    mDistance = distance;

  }

  public int Volume(Parcel parcel) {
    return (parcel.mWidth * parcel.mHeight * parcel.mLength);
  }

  public int costToShip(Parcel parcel) {
    DecimalFormat df = new DecimalFormat("#.00");

    int volumePrice = 0;
    int weightPrice = 0;
    int distancePrice = 0;

    if (parcel.Volume(parcel) < 1000) {
      volumePrice = 5;
    } else if (parcel.Volume(parcel) >= 1000 && parcel.Volume(parcel) < 10000) {
      volumePrice = 10;
    } else if (parcel.Volume(parcel) >= 10000) {
      volumePrice = 20;
    }

    if (parcel.mWeight < 10) {
      weightPrice = 5;
    } else if (parcel.mWeight >= 10 && parcel.mWeight < 50) {
      weightPrice = 10;
    } else if (parcel.mWeight >= 50) {
      weightPrice = 20;
    }

    if (parcel.mDistance < 100) {
      distancePrice = 5;
    } else if (parcel.mDistance >= 100 && parcel.mDistance < 500) {
      distancePrice = 10;
    } else if (parcel.mDistance >= 500) {
      distancePrice = 20;
    }

    return (volumePrice + weightPrice + distancePrice);
  }

}
