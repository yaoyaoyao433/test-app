package com.meituan.msc.mmpviews.list.event;

import android.view.View;
import com.meituan.msc.mmpviews.list.msclist.MSCListNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public Map<String, String> d;
    public String e;
    public JSONObject f;
    public MSCListNode g;
    public int h;
    public View i;
    public int j;
    public boolean k;
    public boolean l;

    public g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3d152b80a30a05e71f6b00316023b53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3d152b80a30a05e71f6b00316023b53");
            return;
        }
        this.c = 0;
        this.d = new HashMap();
        this.j = -1;
        this.k = false;
        this.l = false;
        this.b = i;
    }

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "340d71ab54f1618ba91f69f9bfc94eba", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "340d71ab54f1618ba91f69f9bfc94eba") : new g(-1);
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eed45f6c96497c46ab66735f1cf8913e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eed45f6c96497c46ab66735f1cf8913e");
        } else {
            this.d.put(str, str2);
        }
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11eb38a91eab5a0991f97515d0e9c396", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11eb38a91eab5a0991f97515d0e9c396")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.b == gVar.b && this.c == gVar.c;
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa19aed5cfc20e64ba805f150491e74b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa19aed5cfc20e64ba805f150491e74b")).intValue() : Objects.hash(Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d69d6a174c9e61c634063603e3114a0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d69d6a174c9e61c634063603e3114a0a");
        }
        int id = this.i != null ? this.i.getId() : 0;
        return "ViewToken{mItemIndex=" + this.b + ", mTouchedView=" + id + ", mTouchedTag=" + this.c + ", mListViewId=" + this.h + '}';
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "882c802f87516b6881bfb4a0c8773099", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "882c802f87516b6881bfb4a0c8773099");
            return;
        }
        this.i = null;
        this.c = 0;
        this.b = -1;
        this.f = new JSONObject();
        this.d.clear();
        this.e = null;
        this.h = 0;
    }
}
