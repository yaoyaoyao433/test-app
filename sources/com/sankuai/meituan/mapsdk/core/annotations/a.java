package com.sankuai.meituan.mapsdk.core.annotations;

import android.annotation.SuppressLint;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.Marker;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a implements r {
    public static ChangeQuickRedirect a;
    protected final u b;
    protected final com.sankuai.meituan.mapsdk.core.interfaces.e c;
    protected WeakReference<ViewGroup> d;
    protected FrameLayout e;
    protected View f;
    protected boolean g;
    protected boolean h;
    int i;
    int j;

    public a(com.sankuai.meituan.mapsdk.core.interfaces.e eVar, u uVar) {
        Object[] objArr = {eVar, uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f27440b1391d725d77651bcd829efdb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f27440b1391d725d77651bcd829efdb2");
            return;
        }
        this.c = eVar;
        this.b = uVar;
        this.d = new WeakReference<>(this.b.e.c);
        this.e = new FrameLayout(this.d.get().getContext());
        this.e.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    @Override // com.sankuai.meituan.mapsdk.core.annotations.r
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b5370fb774dfac500d5d7a0aeb8f226", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b5370fb774dfac500d5d7a0aeb8f226");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e2afc2fcab5f391add70c34fdd7af69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e2afc2fcab5f391add70c34fdd7af69");
        } else {
            MTMap.InfoWindowAdapter infoWindowAdapter = this.b.b;
            View view = null;
            if (infoWindowAdapter != null) {
                this.g = false;
                View infoWindow = infoWindowAdapter.getInfoWindow(new Marker(this.c));
                ViewGroup viewGroup = infoWindow;
                if (infoWindow == null) {
                    View infoContents = infoWindowAdapter.getInfoContents(new Marker(this.c));
                    viewGroup = infoWindow;
                    if (infoContents != null) {
                        viewGroup = infoWindow;
                        if (this.d.get().getContext() != null) {
                            ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(this.d.get().getContext()).inflate(R.layout.mtmapsdk_info_window_box, (ViewGroup) null);
                            if (infoContents.getParent() != null) {
                                ((ViewGroup) infoContents.getParent()).removeView(infoContents);
                            }
                            viewGroup2.addView(infoContents);
                            viewGroup = viewGroup2;
                        }
                    }
                }
                if (this.f != null && this.e != null && this.d.get() != null) {
                    this.e.removeView(this.f);
                    this.d.get().removeView(this.e);
                }
                this.f = viewGroup;
            }
            if (this.f == null) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f7320ffeef0d5b9126d2bdc541dc92d0", RobustBitConfig.DEFAULT_VALUE)) {
                    view = (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f7320ffeef0d5b9126d2bdc541dc92d0");
                } else if (this.d.get() != null && this.e != null) {
                    this.g = true;
                    view = LayoutInflater.from(this.d.get().getContext()).inflate(R.layout.mtmapsdk_infowindow_content, (ViewGroup) this.e, false);
                }
                this.f = view;
            }
            if (this.g) {
                this.d.get().removeView(this.e);
            }
            if (this.e != null && this.b.c != null) {
                this.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.meituan.mapsdk.core.annotations.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object[] objArr4 = {view2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f1b70c71d838d6f0cd0feb88b8f9fe74", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f1b70c71d838d6f0cd0feb88b8f9fe74");
                            return;
                        }
                        MTMap.OnInfoWindowClickListener onInfoWindowClickListener = a.this.b.c;
                        if (onInfoWindowClickListener != null) {
                            onInfoWindowClickListener.onInfoWindowClick(new Marker(a.this.c));
                            onInfoWindowClickListener.onInfoWindowClickLocation(view2.getWidth(), view2.getHeight(), a.this.i, a.this.j);
                            a aVar = a.this;
                            a.this.j = 0;
                            aVar.i = 0;
                        }
                    }
                });
                this.e.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.meituan.mapsdk.core.annotations.a.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnTouchListener
                    @SuppressLint({"ClickableViewAccessibility"})
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        Object[] objArr4 = {view2, motionEvent};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "29f36c1a15acff3a5d6ea834f1fc6101", RobustBitConfig.DEFAULT_VALUE)) {
                            return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "29f36c1a15acff3a5d6ea834f1fc6101")).booleanValue();
                        }
                        if (motionEvent.getActionMasked() == 0) {
                            a.this.i = (int) motionEvent.getX();
                            a.this.j = (int) motionEvent.getY();
                        }
                        return false;
                    }
                });
            }
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d22b3b8944d35b6142c7e4fcedf1575f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d22b3b8944d35b6142c7e4fcedf1575f");
        } else if (this.g && this.f != null) {
            TextView textView = (TextView) this.f.findViewById(R.id.infowindow_title);
            TextView textView2 = (TextView) this.f.findViewById(R.id.infowindow_description);
            String title = this.c.getTitle();
            String snippet = this.c.getSnippet();
            if (TextUtils.isEmpty(title) && TextUtils.isEmpty(snippet)) {
                this.f.setVisibility(8);
            } else {
                this.f.setVisibility(0);
                if (textView != null) {
                    if (TextUtils.isEmpty(title)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(this.c.getTitle());
                        textView.setVisibility(0);
                    }
                }
                if (textView2 != null) {
                    if (TextUtils.isEmpty(snippet)) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setText(this.c.getSnippet());
                        textView2.setVisibility(0);
                    }
                }
            }
        }
        if (this.e == null || this.f == null) {
            return;
        }
        this.f.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f.getMeasuredWidth(), this.f.getMeasuredHeight());
        if (this.f.getParent() != null) {
            ((ViewGroup) this.f.getParent()).removeView(this.f);
        }
        this.e.addView(this.f, layoutParams);
    }
}
