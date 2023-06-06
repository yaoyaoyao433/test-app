package com.meituan.android.customerservice.floating;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.meituan.android.customerservice.floating.base.BaseFloatingView;
import com.meituan.android.customerservice.kit.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UploadFloatingView extends BaseFloatingView implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private RelativeLayout g;
    private a h;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();
    }

    @Override // com.meituan.android.customerservice.floating.base.BaseFloatingView
    public final void a() {
    }

    @Override // com.meituan.android.customerservice.floating.base.BaseFloatingView
    public int getCustomSize() {
        return 0;
    }

    public UploadFloatingView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "551d1dbb7bbda53c822a7b2f5f753af4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "551d1dbb7bbda53c822a7b2f5f753af4");
        }
    }

    private UploadFloatingView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54d9ba2fd57e49784617aca11cedd168", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54d9ba2fd57e49784617aca11cedd168");
        }
    }

    public UploadFloatingView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59afc811c98b910ae362ebd27839078f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59afc811c98b910ae362ebd27839078f");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1df6eda726d0a2fb65cadddff15efc33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1df6eda726d0a2fb65cadddff15efc33");
            return;
        }
        inflate(getContext(), R.layout.cs_upload_view_floating, this);
        findViewById(R.id.btn_close).setOnClickListener(this);
        this.g = (RelativeLayout) findViewById(R.id.view_upload_floating);
        this.g.setOnClickListener(this);
        this.g.setOnTouchListener(this);
        a(85, 0, c.a(getContext(), 49.0f));
        setToEdge(true);
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3a905b15c78aa4a341cc5e8e0dab36d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3a905b15c78aa4a341cc5e8e0dab36d");
        } else if (this.h == null) {
        } else {
            if (view.getId() == R.id.btn_close) {
                this.h.a();
            } else if (view.getId() == R.id.view_upload_floating) {
                this.h.b();
            }
        }
    }

    public void setOnFloatingClickListener(a aVar) {
        this.h = aVar;
    }
}
