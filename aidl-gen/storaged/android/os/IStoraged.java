/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java -o /home/shadichy/Documents/bliss/los-21/system/core/storaged/aidl-gen/storaged -I /home/shadichy/Documents/bliss/los-21/system/core/storaged/binder /home/shadichy/Documents/bliss/los-21/system/core/storaged/binder/android/os/IStoraged.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.os;
/** {@hide} */
public interface IStoraged extends android.os.IInterface
{
  /** Default implementation for IStoraged. */
  public static class Default implements android.os.IStoraged
  {
    @Override public void onUserStarted(int userId) throws android.os.RemoteException
    {
    }
    @Override public void onUserStopped(int userId) throws android.os.RemoteException
    {
    }
    @Override public int getRecentPerf() throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.os.IStoraged
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.os.IStoraged interface,
     * generating a proxy if needed.
     */
    public static android.os.IStoraged asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.os.IStoraged))) {
        return ((android.os.IStoraged)iin);
      }
      return new android.os.IStoraged.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(DESCRIPTOR);
      }
      switch (code)
      {
        case TRANSACTION_onUserStarted:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.onUserStarted(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onUserStopped:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.onUserStopped(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getRecentPerf:
        {
          int _result = this.getRecentPerf();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.os.IStoraged
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public final java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void onUserStarted(int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onUserStarted, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onUserStopped(int userId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(userId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onUserStopped, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public int getRecentPerf() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRecentPerf, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    /** @hide */
    public static final java.lang.String DESCRIPTOR = "android.os.IStoraged";
    static final int TRANSACTION_onUserStarted = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onUserStopped = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getRecentPerf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
  }
  public void onUserStarted(int userId) throws android.os.RemoteException;
  public void onUserStopped(int userId) throws android.os.RemoteException;
  public int getRecentPerf() throws android.os.RemoteException;
}
