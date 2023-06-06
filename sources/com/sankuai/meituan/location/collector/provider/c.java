package com.sankuai.meituan.location.collector.provider;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.location.collector.locator.d;
/* loaded from: classes4.dex */
public abstract class c implements d.a {
    public static ChangeQuickRedirect a;
    public Handler b;

    /* loaded from: classes4.dex */
    public class a extends Handler {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            String str;
            Object[] objArr = {message};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcd0bd8344037773c3931e4ddb10caa9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcd0bd8344037773c3931e4ddb10caa9");
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
                        str = "AbstractMsgHandler handleMessage get nmea but type is:" + i2;
                        break;
                    case 3:
                        if (i2 == 0) {
                            c.this.d(mtLocation, i2);
                            return;
                        }
                        str = "AbstractMsgHandler handleMessage get satellites but type is " + i2;
                        break;
                    case 4:
                        return;
                    case 5:
                        if (i2 == 4) {
                            c.this.e(mtLocation, i2);
                            return;
                        }
                        str = "AbstractMsgHandler handleMessage get Inertial but type is " + i2;
                        break;
                    default:
                        LogUtils.a("AbstractMsgHandler handleMessage error eventId " + i);
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
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37f3c5285bb08395b46ce19c1b0a5524", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37f3c5285bb08395b46ce19c1b0a5524");
        } else {
            this.b = new a();
        }
    }

    @Override // com.sankuai.meituan.location.collector.locator.d.a
    public final void a(MtLocation mtLocation) {
        Object[] objArr = {mtLocation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a9210c74680b2421ef2acdcea43aec0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a9210c74680b2421ef2acdcea43aec0");
        } else if (mtLocation == null) {
            LogUtils.a("AbstractMsgHandler onLocationGot location is null");
        } else {
            Bundle extras = mtLocation.getExtras();
            if (extras == null) {
                LogUtils.a("AbstractMsgHandler onLocationGot args is null");
                return;
            }
            int i = extras.getInt(Constants.SPEED_METER_STEP, -1);
            int i2 = extras.getInt("type", -1);
            LogUtils.a("AbstractMsgHandler onLocationGot eventId " + i + " type " + i2);
            Message message = new Message();
            Bundle bundle = new Bundle();
            message.what = i;
            message.arg1 = i2;
            bundle.putParcelable("location", mtLocation);
            message.setData(bundle);
            this.b.sendMessage(message);
        }
    }

    public abstract void a(MtLocation mtLocation, int i);

    public abstract void b(MtLocation mtLocation, int i);

    public abstract void c(MtLocation mtLocation, int i);

    public abstract void d(MtLocation mtLocation, int i);

    public abstract void e(MtLocation mtLocation, int i);
}
