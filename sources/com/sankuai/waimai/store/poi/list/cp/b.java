package com.sankuai.waimai.store.poi.list.cp;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsListener;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends FrameLayout {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.param.a b;
    public LinearLayout c;
    public Context d;
    public int e;
    public int f;
    private final int g;
    private final int h;

    public b(Context context, com.sankuai.waimai.store.param.a aVar) {
        super(context);
        Object[] objArr = {context, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd770b5af3380a701109478a0d92417d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd770b5af3380a701109478a0d92417d");
            return;
        }
        this.e = TbsListener.ErrorCode.NEEDDOWNLOAD_FALSE_1;
        this.g = 12;
        this.h = 8;
        this.d = context;
        this.b = aVar;
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "efefa4d97bbe00c336c6e56d7cd946c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "efefa4d97bbe00c336c6e56d7cd946c0");
            return;
        }
        this.c = new LinearLayout(context);
        this.c.setOrientation(0);
        addView(this.c, -1, -1);
    }

    public final void a(int i, int i2, ArrayList<String> arrayList) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f094219402d41f7af4a52e4267b56472", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f094219402d41f7af4a52e4267b56472");
            return;
        }
        this.f = i2;
        if (this.c != null) {
            for (int i3 = 0; i3 < this.c.getChildCount(); i3++) {
                a aVar = (a) this.c.getChildAt(i3);
                if (aVar != null) {
                    aVar.a(i, i2, arrayList);
                }
            }
        }
    }
}
