package com.meituan.android.common.locate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.meituan.android.common.locate.Locator;
import com.meituan.android.common.locate.util.FakeMainThread;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public abstract class c implements Locator.LocationListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Handler a;

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes2.dex */
    public class a extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        public a() {
            super(FakeMainThread.getInstance().getLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4851b0464806c4a71d218f29a28e1497", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4851b0464806c4a71d218f29a28e1497");
                return;
            }
            try {
                MtLocation mtLocation = (MtLocation) message.getData().getParcelable("location");
                int i = message.what;
                int i2 = message.arg1;
                switch (i) {
                    case 0:
                        c.this.a(mtLocation, i2);
                        return;
                    case 1:
                        c.this.b(mtLocation, i2);
                        return;
                    case 2:
                        if (i2 == 0) {
                            c.this.c(mtLocation, i2);
                            return;
                        }
                        str = "LocatorMsgHandler handleMessage get nmea but type is:" + i2;
                        break;
                    case 3:
                        if (i2 == 0) {
                            c.this.d(mtLocation, i2);
                            return;
                        }
                        str = "LocatorMsgHandler handleMessage get satellites but type is " + i2;
                        break;
                    case 4:
                        c.this.f(mtLocation, i2);
                        return;
                    case 5:
                        if (i2 == 4) {
                            c.this.e(mtLocation, i2);
                            return;
                        }
                        str = "LocatorMsgHandler handleMessage get Inertial but type is " + i2;
                        break;
                    default:
                        LogUtils.a("LocatorMsgHandler handleMessage error eventId " + i);
                        c.this.g(mtLocation, i2);
                        return;
                }
                LogUtils.a(str);
            } catch (Exception e) {
                LogUtils.a(getClass(), e);
            }
        }
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ed3d1613f29b2a1ca7da1600d2a3f808", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ed3d1613f29b2a1ca7da1600d2a3f808");
        } else {
            this.a = new a();
        }
    }

    public abstract void a(MtLocation mtLocation, int i);

    public abstract void b(MtLocation mtLocation, int i);

    public abstract void c(MtLocation mtLocation, int i);

    public abstract void d(MtLocation mtLocation, int i);

    public abstract void e(MtLocation mtLocation, int i);

    public abstract void f(MtLocation mtLocation, int i);

    public abstract void g(MtLocation mtLocation, int i);

    @Override // com.meituan.android.common.locate.Locator.LocationListener
    public void onLocationGot(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62d6a4bd77d255bfad3ae001de554fe7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62d6a4bd77d255bfad3ae001de554fe7");
        } else if (mtLocation == null) {
            LogUtils.a("LocatorMsgHandler onLocationGot location is null");
        } else {
            Bundle extras = mtLocation.getExtras();
            if (extras == null) {
                LogUtils.a("LocatorMsgHandler onLocationGot args is null");
                return;
            }
            int i = extras.getInt(Constants.SPEED_METER_STEP, -1);
            int i2 = extras.getInt("type", -1);
            LogUtils.a("LocatorMsgHandler onLocationGot eventId " + i + " type " + i2);
            Message message = new Message();
            Bundle bundle = new Bundle();
            message.what = i;
            message.arg1 = i2;
            bundle.putParcelable("location", mtLocation);
            message.setData(bundle);
            if (message.what == 1) {
                b(mtLocation, i2);
            } else {
                this.a.sendMessage(message);
            }
        }
    }
}
