package com.sankuai.xm.imui.session.view;

import android.content.Context;
import android.support.annotation.CallSuper;
import android.support.annotation.IntRange;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.im.message.bean.MediaMessage;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.view.message.AbstractMsgSideView;
import com.sankuai.xm.imui.session.view.adapter.IExtraAdapter;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class MediaMsgView<M extends MediaMessage, CA extends IExtraAdapter<M>> extends BaseCommonView<M, CA> {
    public static ChangeQuickRedirect s;

    public MediaMsgView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb6e4d87be20b68f72486e86ad6bc9a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb6e4d87be20b68f72486e86ad6bc9a4");
        }
    }

    private MediaMsgView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48d771123a94d5de774496ec0be45f9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48d771123a94d5de774496ec0be45f9c");
        }
    }

    public MediaMsgView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "183f1a4fd535fc1e2416aa5a27506de4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "183f1a4fd535fc1e2416aa5a27506de4");
        }
    }

    @CallSuper
    public void a(String str, int i, @IntRange(from = 0, to = 100) int i2) {
        boolean z;
        int i3;
        int i4;
        Object[] objArr = {str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aec0780b67388242e9e088f936606e0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aec0780b67388242e9e088f936606e0c");
            return;
        }
        switch (i) {
            case 3:
            case 8:
                z = true;
                i3 = 100;
                break;
            case 4:
            case 7:
                z = true;
                i3 = 0;
                break;
            case 5:
            case 6:
            default:
                i3 = i2;
                z = false;
                break;
        }
        if (z) {
            i4 = 3;
            d.b("MediaMsgView::updateFileStatus fileStatus:%s, type:%s, uuid:%s, url:%s", Integer.valueOf(i), Integer.valueOf(((MediaMessage) this.n.b).getMsgType()), this.n.b(), str);
        } else {
            i4 = 3;
        }
        if (i == 2) {
            a(i4);
        } else if (i == 4) {
            a(4);
        }
        ((MediaMessage) this.n.b).setFileStatus(i);
        b(i3);
        Iterator<com.sankuai.xm.imui.common.view.message.a> it = this.p.iterator();
        while (it.hasNext()) {
            com.sankuai.xm.imui.common.view.message.a next = it.next();
            if (next instanceof AbstractMsgSideView) {
                ((AbstractMsgSideView) next).a(this.n, 2);
            }
        }
    }

    @CallSuper
    public void b(@IntRange(from = 0, to = 100) int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = s;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4258d82c2cad84d3a6cbcc5e0633fa3c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4258d82c2cad84d3a6cbcc5e0633fa3c");
        } else {
            this.n.f = i;
        }
    }
}
