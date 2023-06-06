package com.meituan.msc.modules.viewmanager;

import android.view.View;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.MSCReadableMap;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.jse.bridge.WritableMap;
import com.meituan.msc.mmpviews.list.msclist.MSCListNode;
import com.meituan.msc.mmpviews.list.msclist.view.MSCListView;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.uimanager.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "MSCListViewModule")
/* loaded from: classes3.dex */
public final class d extends k {
    public static ChangeQuickRedirect a;
    private ReactApplicationContext b;

    public d(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74c2b46398cf7d363a92ebee4af3a995", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74c2b46398cf7d363a92ebee4af3a995");
        } else {
            this.b = reactApplicationContext;
        }
    }

    @MSCMethod
    public final void queryListItemVisibility(final int i, final com.meituan.msc.modules.manager.b bVar) {
        Object[] objArr = {Integer.valueOf(i), bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72e597e788f98bf71f7464cd7a2b35b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72e597e788f98bf71f7464cd7a2b35b5");
        } else {
            this.b.runOnUiQueueThread(new Runnable() { // from class: com.meituan.msc.modules.viewmanager.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6269cdae50651e3094ef9a9ee22e36ba", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6269cdae50651e3094ef9a9ee22e36ba");
                        return;
                    }
                    MSCListView mSCListView = (MSCListView) d.this.b.getUIManagerModule().c(i);
                    if (mSCListView != null) {
                        bVar.a(mSCListView.c());
                    }
                }
            });
        }
    }

    @MSCMethod
    public final void query(final int i, final int i2, final String str, final JSONObject jSONObject, final com.meituan.msc.modules.manager.b bVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, jSONObject, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02e37f93a2d364f9ba8af396474d16a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02e37f93a2d364f9ba8af396474d16a8");
        } else {
            this.b.runOnUiQueueThread(new Runnable() { // from class: com.meituan.msc.modules.viewmanager.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "15ad0b0e88c18f36527153168b4619d0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "15ad0b0e88c18f36527153168b4619d0");
                        return;
                    }
                    WritableArray createArray = Arguments.createArray();
                    try {
                        View c = d.this.b.getUIManagerModule().c(d.this.b.getUIManagerModule().b().h().a().a());
                        if (c == null) {
                            bVar.a(createArray);
                            return;
                        }
                        for (MSCListNode mSCListNode : com.meituan.msc.mmpviews.list.common.b.a((MSCListView) d.this.b.getUIManagerModule().c(i), i2, str)) {
                            View g = mSCListNode.uiImplementation.g(mSCListNode.mReactTag);
                            if (g != null) {
                                JSONObject a2 = com.meituan.msc.mmpviews.list.common.a.a(mSCListNode.mProps, i2);
                                WritableMap a3 = af.a(c, g, new MSCReadableMap(jSONObject));
                                a3.putMap("dataset", new MSCReadableMap(a2));
                                createArray.pushMap(a3);
                            }
                        }
                        bVar.a(createArray);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        bVar.a(createArray);
                    }
                }
            });
        }
    }
}
