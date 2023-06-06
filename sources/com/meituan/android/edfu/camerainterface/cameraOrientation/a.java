package com.meituan.android.edfu.camerainterface.cameraOrientation;

import android.content.Context;
import android.provider.Settings;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.OrientationEventListener;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.rtmp.TXLiveConstants;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static final SparseIntArray b;
    public final OrientationEventListener c;
    public InterfaceC0252a d;
    public int e;
    public Display f;
    private Context g;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.edfu.camerainterface.cameraOrientation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0252a {
        void a(int i);

        void b(int i);
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = sparseIntArray;
        sparseIntArray.put(0, 0);
        b.put(1, 90);
        b.put(2, TXLiveConstants.RENDER_ROTATION_180);
        b.put(3, 270);
    }

    public a(Context context, InterfaceC0252a interfaceC0252a) {
        Object[] objArr = {context, interfaceC0252a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d67fd056cb2f614cc382d3f36800ff0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d67fd056cb2f614cc382d3f36800ff0");
            return;
        }
        this.e = 0;
        this.d = interfaceC0252a;
        this.g = context;
        this.c = new OrientationEventListener(context) { // from class: com.meituan.android.edfu.camerainterface.cameraOrientation.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6be9b4e2044f2ed133199712fdb88282", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6be9b4e2044f2ed133199712fdb88282");
                } else if (i == -1 || a.this.f == null) {
                } else {
                    int rotation = a.this.f.getRotation();
                    if (a.this.e != rotation) {
                        a.this.e = rotation;
                        a.this.d.a(a.b.get(a.this.e));
                    }
                    if (a.this.d != null) {
                        int i2 = ((i + 45) / 90) * 90;
                        if (a.this.a() && i2 % 360 == 180) {
                            return;
                        }
                        a.this.d.b(i2 % 360);
                    }
                }
            }
        };
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72d860e49a0120936f76b17a2927e67d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72d860e49a0120936f76b17a2927e67d")).booleanValue();
        }
        try {
            return 1 == Settings.System.getInt(this.g.getContentResolver(), "accelerometer_rotation");
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7ffa061652a3946db2b36b91ec1bcf9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7ffa061652a3946db2b36b91ec1bcf9")).booleanValue();
        }
        int i = b.get(this.e);
        return i == 90 || i == 270;
    }
}
