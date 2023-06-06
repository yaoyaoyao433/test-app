package com.sankuai.xm.base.tinyorm;

import android.content.ContentValues;
import android.database.Cursor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.sankuai.xm.base.tinyorm.d;
import java.util.LinkedList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c {
    public static ChangeQuickRedirect a;
    e b;

    public c(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f97eea4d5b261726cff33c98074a8c9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f97eea4d5b261726cff33c98074a8c9");
        } else {
            this.b = eVar;
        }
    }

    public final String[] a(Class cls) {
        LinkedList<d.a> linkedList;
        int i = 0;
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aade55716947f6986260d29a37784759", 6917529027641081856L)) {
            return (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aade55716947f6986260d29a37784759");
        }
        d a2 = this.b.a(cls);
        if (a2 == null || (linkedList = a2.f) == null || linkedList.isEmpty()) {
            return null;
        }
        String[] strArr = new String[linkedList.size()];
        for (d.a aVar : linkedList) {
            StringBuilder sb = new StringBuilder();
            String str = aVar.b;
            String str2 = aVar.c;
            boolean z = aVar.d;
            sb.append("CREATE ");
            if (z) {
                sb.append("UNIQUE ");
            }
            sb.append("INDEX IF NOT EXISTS ");
            sb.append(str);
            sb.append(StringUtil.SPACE);
            sb.append("ON ");
            sb.append(a2.b);
            sb.append(CommonConstant.Symbol.BRACKET_LEFT);
            sb.append(str2);
            sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
            sb.append(";");
            strArr[i] = sb.toString();
            i++;
        }
        return strArr;
    }

    public final ContentValues a(Object obj, String[] strArr) {
        Object[] objArr = {obj, strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f8a603e4700b37fbfb49f702f00239d", 6917529027641081856L)) {
            return (ContentValues) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f8a603e4700b37fbfb49f702f00239d");
        }
        TableProxy b = this.b.b(obj);
        if (b == null) {
            return null;
        }
        return b.update(obj, strArr);
    }

    public final Object a(Class cls, Cursor cursor) {
        Object[] objArr = {cls, cursor};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2284b0fd4e92ecbcfa62ec387c158b08", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2284b0fd4e92ecbcfa62ec387c158b08");
        }
        TableProxy b = this.b.b(cls);
        if (b == null) {
            return null;
        }
        return b.query(cursor);
    }

    public final String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b6e86714037822a34acd42859c7096a", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b6e86714037822a34acd42859c7096a");
        }
        TableProxy b = this.b.b(obj);
        if (b == null) {
            return null;
        }
        return b.where(obj);
    }
}
