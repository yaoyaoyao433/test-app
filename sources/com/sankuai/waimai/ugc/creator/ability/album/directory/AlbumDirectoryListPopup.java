package com.sankuai.waimai.ugc.creator.ability.album.directory;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class AlbumDirectoryListPopup extends PopupWindow {
    public static ChangeQuickRedirect a;
    public final Context b;
    public a c;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);
    }

    public AlbumDirectoryListPopup(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "671317e926009c2df079c16da840a109", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "671317e926009c2df079c16da840a109");
        }
    }

    private AlbumDirectoryListPopup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, R.attr.listPopupWindowStyle);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98dacbe5e4cc714d10fa314fb8b8b8ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98dacbe5e4cc714d10fa314fb8b8b8ec");
        }
    }

    public AlbumDirectoryListPopup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccbca69a060ff3587500b8057607b011", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccbca69a060ff3587500b8057607b011");
        }
    }

    private AlbumDirectoryListPopup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, 0);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e93aebe76471b2ca3c42f13f1353e7c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e93aebe76471b2ca3c42f13f1353e7c2");
            return;
        }
        this.b = context;
        setBackgroundDrawable(new ColorDrawable(0));
        setOutsideTouchable(true);
        setFocusable(true);
        setTouchable(true);
        setWidth(-1);
    }
}
