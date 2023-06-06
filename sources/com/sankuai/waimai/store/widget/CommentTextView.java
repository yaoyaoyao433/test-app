package com.sankuai.waimai.store.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.platform.domain.core.comment.CommentGood;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CommentTextView extends TextView {
    public static ChangeQuickRedirect a;
    private List<CommentGood> b;
    private char c;
    private a d;
    private a e;
    private boolean f;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    public CommentTextView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b002b972ac284d619525d2f3548a7032", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b002b972ac284d619525d2f3548a7032");
            return;
        }
        this.b = new ArrayList();
        this.c = '#';
        this.e = new a() { // from class: com.sankuai.waimai.store.widget.CommentTextView.1
        };
        this.f = false;
    }

    public CommentTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "877d6f8c7519bf31ec63b6d5030c4a6d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "877d6f8c7519bf31ec63b6d5030c4a6d");
            return;
        }
        this.b = new ArrayList();
        this.c = '#';
        this.e = new a() { // from class: com.sankuai.waimai.store.widget.CommentTextView.1
        };
        this.f = false;
    }

    public void setCommentGoodList(List<CommentGood> list) {
        this.b = list;
    }

    public void setOnSpanTextListener(a aVar) {
        this.d = aVar;
    }

    public void setShowCurrentGoodsLabel(boolean z) {
        this.f = z;
    }
}
