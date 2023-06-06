package com.sankuai.waimai.store.poi.list.widget.tag;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.platform.widget.tag.virtualtag.TagCanvasView;
import com.sankuai.waimai.platform.widget.tag.virtualview.render.g;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.poilist.view.b;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.widgets.tag.c;
import com.sankuai.waimai.store.widgets.tag.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a implements View.OnClickListener, d.a {
    public static ChangeQuickRedirect a = null;
    private static final String r = "a";
    public List<c> b;
    public String c;
    public String d;
    public String e;
    public TagCanvasView f;
    public ViewGroup g;
    public d h;
    public Context i;
    public View j;
    public View k;
    public View l;
    public int m;
    public boolean n;
    public b.a o;
    public List<Poi.NewLabelInfoListItem> p;
    public List<PoiVerticality.NewCategoryLabel> q;
    private List<c> s;
    private List<Poi.LabelInfoListItem> t;
    private List<PoiVerticality.CategoryLabel> u;
    private boolean v;
    private Drawable w;
    private Drawable x;

    public a(@NonNull Context context, @NonNull TagCanvasView tagCanvasView, ViewGroup viewGroup, boolean z) {
        Object[] objArr = {context, tagCanvasView, viewGroup, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db983d764f60488ff734a43046e029ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db983d764f60488ff734a43046e029ce");
            return;
        }
        this.c = "";
        this.v = false;
        this.d = "";
        this.e = "";
        this.m = -2894892;
        this.i = context;
        this.f = tagCanvasView;
        this.g = viewGroup;
        this.f.setLineSpace(h.a(this.i, 8.0f));
        this.f.setTagSpace(h.a(this.i, 4.0f));
        this.h = new d(this.i, null, z);
        this.h.e = this;
        this.f.setAdapter(this.h);
    }

    public final void a(String str, List<Poi.LabelInfoListItem> list, List<PoiVerticality.CategoryLabel> list2) {
        Object[] objArr = {str, list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4aa2802066edc96d697a3499e752e92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4aa2802066edc96d697a3499e752e92");
            return;
        }
        this.c = str;
        this.t = list;
        this.u = list2;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9f3a0cb6e2b64f02126ac812cbc76d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9f3a0cb6e2b64f02126ac812cbc76d7");
        } else if (!com.sankuai.shangou.stone.util.a.b(this.t)) {
            ArrayList<String> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setTextSize(h.a(this.i, 11.0f));
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            int a2 = h.a(this.i, 216.0f);
            int a3 = h.a(this.i, 4.0f);
            for (Poi.LabelInfoListItem labelInfoListItem : this.t) {
                if (labelInfoListItem != null) {
                    sb3.append(labelInfoListItem.content);
                    sb3.append(";");
                    if (labelInfoListItem.priority == 0) {
                        arrayList2.add(labelInfoListItem.content);
                    } else {
                        arrayList.add(labelInfoListItem.content);
                    }
                }
            }
            if (sb3.length() > 0) {
                sb3.deleteCharAt(sb3.length() - 1);
            }
            this.e = sb3.toString();
            for (String str2 : arrayList) {
                if (!t.a(str2)) {
                    int measureText = a2 - (((int) (paint.measureText(str2, 0, str2.length()) + 0.5f)) + (a3 * 3));
                    if (measureText < 0) {
                        break;
                    }
                    sb.append(str2);
                    sb.append(CommonConstant.Symbol.COMMA);
                    a2 = measureText;
                } else {
                    a2 -= a3 * 2;
                }
            }
            int i = 0;
            while (i < arrayList2.size()) {
                String str3 = (String) arrayList2.get(i);
                if (!t.a(str3)) {
                    int measureText2 = (int) (paint.measureText(str3, 0, str3.length()) + 0.5f);
                    a2 -= i == 0 ? measureText2 + (a3 * 2) : measureText2 + (a3 * 3);
                    if (a2 < 0) {
                        break;
                    }
                    sb2.append(str3);
                    sb2.append(CommonConstant.Symbol.COMMA);
                } else {
                    a2 -= a3 * 2;
                }
                i++;
            }
            sb2.append((CharSequence) sb);
            this.d = sb2.toString();
            if (!t.a(this.d)) {
                this.d = this.d.substring(0, this.d.length() - 1);
            }
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ccb43a6b7577f8d1a247be4fd20e0f03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ccb43a6b7577f8d1a247be4fd20e0f03");
        } else if (com.sankuai.shangou.stone.util.a.b(this.t)) {
            u.c(this.g);
        } else {
            this.b = com.sankuai.waimai.store.widgets.tag.a.a(this.i, this.t);
            u.a(this.g);
        }
        this.f.setMaxLines(1);
        this.h.b(this.b);
        this.h.notifyChanged();
        if (com.sankuai.shangou.stone.util.a.b(list2)) {
            u.c(this.j);
            return;
        }
        u.a(this.j);
        a(false);
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4873b222f0dbed5dc7190d629c4e5d73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4873b222f0dbed5dc7190d629c4e5d73");
        } else if (this.k != null) {
            if (z) {
                if (this.w == null || this.n) {
                    this.n = false;
                    Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(this.i.getResources(), (int) R.drawable.wm_sc_poi_channel_common_arrow_down);
                    Bitmap createBitmap = Bitmap.createBitmap(a2.getWidth(), a2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.rotate(180.0f, a2.getWidth() / 2.0f, a2.getHeight() / 2.0f);
                    canvas.drawBitmap(a2, 0.0f, 0.0f, (Paint) null);
                    this.w = e.a(new BitmapDrawable(this.i.getResources(), createBitmap), this.m);
                }
                this.k.setBackground(this.w);
                return;
            }
            if (this.x == null || this.n) {
                this.n = false;
                this.x = e.a(this.i.getResources().getDrawable(R.drawable.wm_sc_poi_channel_common_arrow_down), this.m);
            }
            this.k.setBackground(this.x);
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24d1c4e51ab1090bda0b52ee75e16177", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24d1c4e51ab1090bda0b52ee75e16177");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5de4a74a016b27334f4225666f803736", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5de4a74a016b27334f4225666f803736");
        } else {
            if (com.sankuai.shangou.stone.util.a.b(this.t)) {
                u.c(this.g);
            } else {
                this.b = com.sankuai.waimai.store.widgets.tag.a.a(this.i, this.t);
                u.a(this.g);
            }
            if (!com.sankuai.shangou.stone.util.a.b(this.u)) {
                Context context = this.i;
                List<PoiVerticality.CategoryLabel> list = this.u;
                Object[] objArr3 = {context, list};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.widgets.tag.a.a;
                List<c> list2 = null;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "8bb7e350a7299daea1cf4f59325a431b", RobustBitConfig.DEFAULT_VALUE)) {
                    list2 = (List) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "8bb7e350a7299daea1cf4f59325a431b");
                } else if (!com.sankuai.shangou.stone.util.a.b(list) && context != null) {
                    list2 = new ArrayList<>();
                    for (int i = 0; i < list.size(); i++) {
                        PoiVerticality.CategoryLabel categoryLabel = list.get(i);
                        if (categoryLabel != null && com.sankuai.shangou.stone.util.a.a((List) categoryLabel.labelInfoList) > 0) {
                            c d = c.d();
                            d.n = true;
                            d.h = i;
                            d.i = 0L;
                            d.g = 1;
                            g.a e = g.a.e();
                            int a2 = com.sankuai.shangou.stone.util.d.a(categoryLabel.labelBackgroundColor, -1);
                            e.i = Integer.valueOf(a2);
                            g.b e2 = g.b.e();
                            e2.d = Integer.valueOf(com.sankuai.shangou.stone.util.d.a(categoryLabel.labelFrameColor, -16777216));
                            e2.e = 1.0f;
                            int a3 = h.a(context, 4.0f);
                            float f = a3;
                            e2.f = new float[]{f, f, f, f};
                            d.e = g.a(e, e2, 0);
                            d.k = new ArrayList();
                            com.sankuai.waimai.platform.widget.tag.virtualview.render.h e3 = com.sankuai.waimai.platform.widget.tag.virtualview.render.h.e();
                            e3.e = false;
                            e3.f = categoryLabel.content;
                            e3.d = h.a(context, 11.0f);
                            e3.i = a3;
                            e3.h = com.sankuai.shangou.stone.util.d.a(categoryLabel.contentColor, -16777216);
                            com.sankuai.waimai.platform.widget.tag.model.g a4 = com.sankuai.waimai.platform.widget.tag.model.g.a(e3);
                            a4.e = 0;
                            a4.d = categoryLabel.categoryLabelType;
                            g.a e4 = g.a.e();
                            e4.i = Integer.valueOf(a2);
                            e4.f();
                            a4.n = g.a(e4, g.b.e(), 0);
                            d.k.add(a4);
                            list2.add(d);
                            if (!com.sankuai.shangou.stone.util.a.b(categoryLabel.labelInfoList)) {
                                Iterator<Poi.LabelInfoListItem> it = categoryLabel.labelInfoList.iterator();
                                while (it.hasNext()) {
                                    Poi.LabelInfoListItem next = it.next();
                                    if (next != null) {
                                        com.sankuai.waimai.store.widgets.tag.a.a(context, list2, next, d.h);
                                    }
                                }
                            }
                        }
                    }
                }
                this.s = list2;
            }
        }
        if (com.sankuai.shangou.stone.util.a.b(this.b) || this.h == null) {
            return;
        }
        if (this.v) {
            this.v = false;
            this.f.setMaxLines(1);
            this.h.b(this.b);
            this.h.notifyChanged();
            a(false);
            if (this.o != null) {
            }
        } else if (!com.sankuai.shangou.stone.util.a.b(this.s)) {
            this.v = true;
            this.f.setMaxLines(10);
            this.h.b(this.s);
            this.h.notifyChanged();
            a(true);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7831b4879bdd8efca48dcb73d41fb04", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7831b4879bdd8efca48dcb73d41fb04");
        } else if (!com.sankuai.shangou.stone.util.a.b(this.p) && !com.sankuai.shangou.stone.util.a.b(this.q)) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "37c46c2f27a46e226db17ebd4be1150f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "37c46c2f27a46e226db17ebd4be1150f");
                return;
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "67fa67c86924a0b51df28e9d88653c84", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "67fa67c86924a0b51df28e9d88653c84");
            } else {
                if (com.sankuai.shangou.stone.util.a.b(this.p)) {
                    u.c(this.g);
                } else {
                    this.b = com.sankuai.waimai.store.widgets.tag.a.b(this.i, this.p);
                    u.a(this.g);
                }
                if (!com.sankuai.shangou.stone.util.a.b(this.q)) {
                    Context context = this.i;
                    List<PoiVerticality.NewCategoryLabel> list = this.q;
                    Object[] objArr4 = {context, list};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.widgets.tag.a.a;
                    List<c> list2 = null;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "dec30b5ce320c9c91ce50593874bcf37", RobustBitConfig.DEFAULT_VALUE)) {
                        list2 = (List) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "dec30b5ce320c9c91ce50593874bcf37");
                    } else if (!com.sankuai.shangou.stone.util.a.b(list) && context != null) {
                        list2 = new ArrayList<>();
                        for (int i = 0; i < list.size(); i++) {
                            PoiVerticality.NewCategoryLabel newCategoryLabel = list.get(i);
                            if (newCategoryLabel != null && com.sankuai.shangou.stone.util.a.a((List) newCategoryLabel.labelInfoList) > 0) {
                                c d = c.d();
                                d.n = true;
                                d.h = i;
                                d.i = 0L;
                                d.g = 1;
                                g.a e = g.a.e();
                                int a2 = com.sankuai.shangou.stone.util.d.a(newCategoryLabel.labelBackgroundColor, -1);
                                e.i = Integer.valueOf(a2);
                                g.b e2 = g.b.e();
                                e2.d = Integer.valueOf(com.sankuai.shangou.stone.util.d.a(newCategoryLabel.labelFrameColor, -16777216));
                                e2.e = 1.0f;
                                int a3 = h.a(context, 4.0f);
                                float f = a3;
                                e2.f = new float[]{f, f, f, f};
                                d.e = g.a(e, e2, 0);
                                d.k = new ArrayList();
                                com.sankuai.waimai.platform.widget.tag.virtualview.render.h e3 = com.sankuai.waimai.platform.widget.tag.virtualview.render.h.e();
                                e3.e = false;
                                e3.f = newCategoryLabel.content;
                                e3.d = h.a(context, 11.0f);
                                e3.i = a3;
                                e3.h = com.sankuai.shangou.stone.util.d.a(newCategoryLabel.contentColor, -16777216);
                                com.sankuai.waimai.platform.widget.tag.model.g a4 = com.sankuai.waimai.platform.widget.tag.model.g.a(e3);
                                a4.e = 0;
                                a4.d = newCategoryLabel.categoryLabelType;
                                g.a e4 = g.a.e();
                                e4.i = Integer.valueOf(a2);
                                e4.f();
                                a4.n = g.a(e4, g.b.e(), 0);
                                d.k.add(a4);
                                list2.add(d);
                                if (!com.sankuai.shangou.stone.util.a.b(newCategoryLabel.labelInfoList)) {
                                    Iterator<Poi.NewLabelInfoListItem> it = newCategoryLabel.labelInfoList.iterator();
                                    while (it.hasNext()) {
                                        Poi.NewLabelInfoListItem next = it.next();
                                        if (next != null) {
                                            com.sankuai.waimai.store.widgets.tag.a.a(context, list2, next, d.h);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.s = list2;
                }
            }
            if (com.sankuai.shangou.stone.util.a.b(this.b) || this.h == null) {
                return;
            }
            if (this.v) {
                this.v = false;
                this.f.setMaxLines(1);
                this.h.b(this.b);
                this.h.notifyChanged();
                a(false);
                if (this.o != null) {
                }
            } else if (!com.sankuai.shangou.stone.util.a.b(this.s)) {
                this.v = true;
                this.f.setMaxLines(10);
                this.h.b(this.s);
                this.h.notifyChanged();
                a(true);
            }
        } else {
            a();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.tag.d.a
    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50facd339c4799f15dba2a87bc00d6ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50facd339c4799f15dba2a87bc00d6ba");
        } else if (i < 10 || !this.h.d) {
            u.c(this.l);
        } else {
            u.a(this.l);
        }
    }
}
