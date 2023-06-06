package com.sankuai.waimai.business.user.comment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RatingBar;
import android.widget.TextView;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.user.comment.adapter.a;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
import com.sankuai.waimai.platform.domain.core.comment.CommentContentLabel;
import com.sankuai.waimai.platform.domain.core.comment.CommentGood;
import com.sankuai.waimai.platform.domain.core.comment.ShareInfo;
import com.sankuai.waimai.platform.widget.CommentTextView;
import com.sankuai.waimai.platform.widget.RoundedCornerImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends BaseAdapter {
    public static ChangeQuickRedirect a;
    final List<Comment> b;
    b c;
    d d;
    c e;
    private long f;
    private final int g;
    private final Context h;
    private final LayoutInflater i;
    private final a.InterfaceC0880a j;
    private String k;
    private com.sankuai.waimai.business.user.comment.helper.a l;
    private boolean m;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b {
        void a(@NonNull Comment comment);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface c {
        void b(@NonNull Comment comment);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface d {
        void a(ShareInfo shareInfo);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public a(Context context, int i, a.InterfaceC0880a interfaceC0880a, String str) {
        Object[] objArr = {context, Integer.valueOf(i), interfaceC0880a, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "406668c429c3e8047532c600477fdadb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "406668c429c3e8047532c600477fdadb");
            return;
        }
        this.f = -1L;
        this.b = new ArrayList();
        this.m = false;
        this.g = i;
        this.h = context;
        this.j = interfaceC0880a;
        this.i = LayoutInflater.from(context);
        this.k = str;
        this.l = new com.sankuai.waimai.business.user.comment.helper.a();
    }

    public final void a(ArrayList<Comment> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f442e55600fa8658b31d9aa7ff3a1962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f442e55600fa8658b31d9aa7ff3a1962");
            return;
        }
        if (arrayList != null) {
            this.b.addAll(arrayList);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        return this.g == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        return this.g == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        return this.g == 3;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26abd12017253d1ec26c21e71424fff6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26abd12017253d1ec26c21e71424fff6")).intValue() : this.b.size();
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public final Comment getItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d05823dc539a4b0a2cfcede8c4fed768", RobustBitConfig.DEFAULT_VALUE) ? (Comment) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d05823dc539a4b0a2cfcede8c4fed768") : this.b.get(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x03a4  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r26, android.view.View r27, android.view.ViewGroup r28) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.user.comment.a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect a;
        ImageView A;
        Comment B;
        int C;
        private TextView E;
        private TextView F;
        private TextView G;
        private TextView H;
        private TextView I;
        private View J;
        private ViewGroup K;
        private View L;
        TextView b;
        com.sankuai.waimai.business.user.comment.adapter.a c;
        TextView d;
        TextView e;
        TextView f;
        CommentTextView g;
        TextView h;
        TextView i;
        RatingBar j;
        TextView k;
        TextView l;
        TextView m;
        TextView n;
        LinearLayout o;
        ImageView p;
        GridView q;
        View r;
        TextView s;
        RoundedCornerImageView t;
        View u;
        View v;
        TextView w;
        TextView x;
        ViewGroup y;
        TextView z;

        public e(View view) {
            Object[] objArr = {a.this, view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65c402d8769414413c1cbcf25e18988e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65c402d8769414413c1cbcf25e18988e");
                return;
            }
            this.C = -1;
            Object[] objArr2 = {view};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58568f4e7e0dc661b135d234d6368671", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58568f4e7e0dc661b135d234d6368671");
            } else {
                this.r = view.findViewById(R.id.layout_adapter_comment_poi);
                this.s = (TextView) this.r.findViewById(R.id.txt_adapter_comment_poi_name);
                this.t = (RoundedCornerImageView) this.r.findViewById(R.id.txt_adapter_comment_poi_pic);
            }
            Object[] objArr3 = {view};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4b5ed99602d28d7363d03138235afca8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4b5ed99602d28d7363d03138235afca8");
            } else {
                this.p = (ImageView) view.findViewById(R.id.img_avatar);
                this.h = (TextView) view.findViewById(R.id.txt_adapter_comment_user_name);
                this.f = (TextView) view.findViewById(R.id.txt_adapter_comment_time);
                this.A = (ImageView) view.findViewById(R.id.img_vip);
            }
            Object[] objArr4 = {view};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "207068f99d67c0f2218c409451ace7cb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "207068f99d67c0f2218c409451ace7cb");
            } else {
                this.I = (TextView) view.findViewById(R.id.txt_adapter_comment_rating_all);
                this.j = (RatingBar) view.findViewById(R.id.rtb_adapter_comment_rating);
                this.d = (TextView) view.findViewById(R.id.txt_adapter_comment_ship_type);
                this.e = (TextView) view.findViewById(R.id.txt_adapter_comment_ship_time);
                this.z = (TextView) view.findViewById(R.id.txt_source_tip);
                this.J = view.findViewById(R.id.layout_adapter_comment_ratings);
                this.k = (TextView) view.findViewById(R.id.txt_adapter_comment_quality_label);
                this.l = (TextView) view.findViewById(R.id.txt_adapter_comment_quality_rating);
                this.m = (TextView) view.findViewById(R.id.txt_adapter_comment_package_rating);
                this.n = (TextView) view.findViewById(R.id.txt_adapter_comment_ship_rating);
                this.I.setVisibility(a.this.b() ? 8 : 0);
                this.J.setVisibility(a.this.b() ? 8 : 0);
            }
            Object[] objArr5 = {view};
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "84c235d0388ab6a6addf97b6e47b3887", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "84c235d0388ab6a6addf97b6e47b3887");
            } else {
                this.g = (CommentTextView) view.findViewById(R.id.txt_adapter_comment_content);
                this.g.setOnSpanTextListener(new CommentTextView.b() { // from class: com.sankuai.waimai.business.user.comment.a.e.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.widget.CommentTextView.b
                    public final void a(View view2, CommentGood commentGood) {
                        Object[] objArr6 = {view2, commentGood};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "d80f90f95a2f39f01190fc353901bdad", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "d80f90f95a2f39f01190fc353901bdad");
                        } else if (commentGood == null || commentGood.getSchemeUrl() == null) {
                        } else {
                            com.sankuai.waimai.foundation.router.a.a(a.this.h, commentGood.getSchemeUrl());
                        }
                    }
                });
                this.b = (TextView) view.findViewById(R.id.txt_adapter_comment_fold);
                this.b.setVisibility(8);
                this.b.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.user.comment.a.e.2
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        Object[] objArr6 = {view2};
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "825d50b3328d40cbb69d11314f1bcce3", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "825d50b3328d40cbb69d11314f1bcce3");
                            return;
                        }
                        e.this.b.setVisibility(8);
                        e.this.g.setMaxLines(100);
                    }
                });
            }
            Object[] objArr6 = {view};
            ChangeQuickRedirect changeQuickRedirect6 = a;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3742d2707491a1a6a93d5eff97448085", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3742d2707491a1a6a93d5eff97448085");
            } else {
                this.q = (GridView) view.findViewById(R.id.grid_adapter_comment_images);
                this.c = new com.sankuai.waimai.business.user.comment.adapter.a(a.this.h, 0, 0);
                this.c.c = a.this.j;
                this.q.setAdapter((ListAdapter) this.c);
            }
            Object[] objArr7 = {view};
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "205c4d13fbe73fc2b510d5e5059d60d4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "205c4d13fbe73fc2b510d5e5059d60d4");
            } else {
                this.K = (ViewGroup) view.findViewById(R.id.layout_adapter_comment_praise);
                this.H = (TextView) view.findViewById(R.id.txt_adapter_comment_praise);
                this.y = (ViewGroup) view.findViewById(R.id.layout_adapter_comment_tags);
                this.i = (TextView) view.findViewById(R.id.txt_adapter_comment_tags);
            }
            Object[] objArr8 = {view};
            ChangeQuickRedirect changeQuickRedirect8 = a;
            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "69e240cf51d0c71baf480b4db948143e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "69e240cf51d0c71baf480b4db948143e");
            } else {
                this.o = (LinearLayout) view.findViewById(R.id.layout_adapter_add_comment);
                this.E = (TextView) view.findViewById(R.id.txt_adapter_comment_add_comment);
                this.F = (TextView) view.findViewById(R.id.txt_adapter_comment_share_comment);
                this.G = (TextView) view.findViewById(R.id.txt_adapter_comment_delete_comment);
                this.L = view.findViewById(R.id.view_adapter_comment_item_divider);
                if (a.this.a()) {
                    this.E.setVisibility(0);
                    this.E.setOnClickListener(this);
                    this.F.setOnClickListener(this);
                    this.F.setVisibility(0);
                    this.G.setOnClickListener(this);
                    this.G.setVisibility(0);
                    this.L.setVisibility(0);
                } else {
                    this.L.setVisibility(8);
                    this.E.setVisibility(8);
                    this.F.setVisibility(8);
                    this.G.setVisibility(8);
                }
            }
            Object[] objArr9 = {view};
            ChangeQuickRedirect changeQuickRedirect9 = a;
            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "a1ae6f2c47171d94131c3eff5f26954b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "a1ae6f2c47171d94131c3eff5f26954b");
                return;
            }
            this.u = view.findViewById(R.id.layout_adapter_comment_float_bar);
            this.w = (TextView) this.u.findViewById(R.id.txt_remind);
            this.v = this.u.findViewById(R.id.btn_close);
            this.x = (TextView) this.u.findViewById(R.id.txt_remind_check_rules);
        }

        void a(Comment comment) {
            int i = 1;
            Object[] objArr = {comment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef9cb68532f47f5ab537d2e043c5f50b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef9cb68532f47f5ab537d2e043c5f50b");
            } else if (a.this.b()) {
                List<Comment.d> list = comment.praiseFoodList;
                if (list == null || list.size() == 0) {
                    this.K.setVisibility(8);
                    return;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String string = a.this.h.getString(R.string.wm_comment_praise_food_separator);
                int i2 = 0;
                while (i2 < list.size()) {
                    Comment.d dVar = list.get(i2);
                    String str = dVar.b;
                    String str2 = dVar.c;
                    if (i2 != list.size() - i) {
                        str = str + string;
                    }
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new C0879a(a.this.h, str2, comment.id, this.C), spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 0);
                    i2++;
                    i = 1;
                }
                this.K.setVisibility(0);
                this.H.setText(spannableStringBuilder);
                this.H.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                ah.a(this.K, this.H, comment.upFoods);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06c99cba45154d936211b0a5099fe23c", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06c99cba45154d936211b0a5099fe23c");
                return;
            }
            int id = view.getId();
            if (id != R.id.layout_adapter_comment_poi) {
                if (id == R.id.txt_adapter_comment_add_comment) {
                    if (a.this.c == null || this.B == null) {
                        return;
                    }
                    a.this.c.a(this.B);
                } else if (id == R.id.txt_adapter_comment_share_comment) {
                    if (a.this.d == null || this.B == null) {
                        return;
                    }
                    a.this.d.a(this.B.shareInfo);
                } else if (id != R.id.txt_adapter_comment_delete_comment || a.this.e == null || this.B == null) {
                } else {
                    a.this.e.b(this.B);
                }
            } else if (this.B != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("poiId", this.B.poiId);
                bundle.putString("poiName", this.B.poiName);
                com.sankuai.waimai.platform.shop.helper.a.a(a.this.h, this.B.restaurantScheme, bundle);
                a.this.a();
                com.sankuai.waimai.business.user.comment.helper.a aVar = a.this.l;
                Context context = a.this.h;
                long j = this.B.poiId;
                boolean c = a.this.c();
                boolean a2 = a.this.a();
                Object[] objArr2 = {context, new Long(j), Byte.valueOf(c ? (byte) 1 : (byte) 0), Byte.valueOf(a2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.user.comment.helper.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "57920a79bbd8c23d3ac7e98502a3b55f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "57920a79bbd8c23d3ac7e98502a3b55f");
                } else if (c) {
                    JudasManualManager.a a3 = JudasManualManager.a("b_9jf3c7zx").a("c_gmmpca6k");
                    a3.b = AppUtil.generatePageInfoKey(context);
                    a3.a("poi_id", j).a();
                } else if (a2) {
                    JudasManualManager.a a4 = JudasManualManager.a("b_nnehfqay").a("c_d900sgd");
                    a4.b = AppUtil.generatePageInfoKey(context);
                    a4.a("poi_id", j).a();
                }
            }
        }

        String a(ArrayList<CommentContentLabel> arrayList) {
            boolean z = true;
            Object[] objArr = {arrayList};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fb4d3d76f22fdb556e138a126849e4e", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fb4d3d76f22fdb556e138a126849e4e");
            }
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            Iterator<CommentContentLabel> it = arrayList.iterator();
            while (it.hasNext()) {
                CommentContentLabel next = it.next();
                if (!TextUtils.isEmpty(next.content)) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(a.this.h.getString(R.string.wm_comment_praise_food_separator));
                    }
                    sb.append(next.content);
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        void a(ViewGroup viewGroup, Comment comment) {
            View inflate;
            String string;
            int i = 2;
            char c = 1;
            Object[] objArr = {viewGroup, comment};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d74fca2fa5851ed9589c911f30ac9b07", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d74fca2fa5851ed9589c911f30ac9b07");
                return;
            }
            List<Comment.a> list = comment.addCommentList;
            viewGroup.removeAllViews();
            if (list != null && !list.isEmpty()) {
                for (Comment.a aVar : list) {
                    if (TextUtils.isEmpty(aVar.d)) {
                        i = 2;
                    } else {
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = viewGroup;
                        objArr2[c] = aVar;
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "238db45030e4fc99ac6aca1ccc0cf9cb", RobustBitConfig.DEFAULT_VALUE)) {
                            inflate = (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "238db45030e4fc99ac6aca1ccc0cf9cb");
                        } else {
                            inflate = a.this.i.inflate(R.layout.wm_comment_list_view_add_comment_item, viewGroup, false);
                            View findViewById = inflate.findViewById(R.id.layout_add_comment_header);
                            TextView textView = (TextView) inflate.findViewById(R.id.txt_add_comment_content);
                            switch (aVar.b) {
                                case 1:
                                    if (!TextUtils.isEmpty(aVar.c)) {
                                        string = aVar.c;
                                        break;
                                    }
                                    string = a.this.h.getString(R.string.wm_comment_add_comment);
                                    break;
                                case 2:
                                    if (TextUtils.isEmpty(aVar.c)) {
                                        string = a.this.h.getString(R.string.wm_comment_poi_reply);
                                        break;
                                    } else {
                                        string = aVar.c;
                                        break;
                                    }
                                default:
                                    string = a.this.h.getString(R.string.wm_comment_add_comment);
                                    break;
                            }
                            if (a.this.a()) {
                                ((TextView) findViewById.findViewById(R.id.txt_add_comment_title)).setText(string);
                                ((TextView) findViewById.findViewById(R.id.txt_add_comment_time)).setText(aVar.e);
                                findViewById.setVisibility(0);
                                textView.setText(aVar.d);
                            } else {
                                findViewById.setVisibility(8);
                                textView.setText(a.this.h.getString(R.string.wm_comment_add_comment_text, string, aVar.d));
                                textView.setTextColor(a.this.h.getResources().getColor(R.color.wm_common_text_auxiliary));
                                viewGroup.addView(inflate);
                                i = 2;
                                c = 1;
                            }
                        }
                        viewGroup.addView(inflate);
                        i = 2;
                        c = 1;
                    }
                }
                viewGroup.setVisibility(0);
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.user.comment.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0879a extends ClickableSpan {
        public static ChangeQuickRedirect a;
        private Context b;
        private String c;
        private long d;
        private int e;

        public C0879a(Context context, String str, long j, int i) {
            Object[] objArr = {context, str, new Long(j), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be8be330ccfa72c1162274174fd2299d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be8be330ccfa72c1162274174fd2299d");
                return;
            }
            this.b = context;
            this.c = str;
            this.d = j;
            this.e = i;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public final void updateDrawState(TextPaint textPaint) {
            Object[] objArr = {textPaint};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67bc6e9c65113190cf307e188d4b96d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67bc6e9c65113190cf307e188d4b96d0");
                return;
            }
            textPaint.setColor(this.b.getResources().getColor(R.color.takeout_blue_5));
            textPaint.setUnderlineText(false);
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(View view) {
            Object[] objArr = {view};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21bc52ca7b7d749396f078415d782bc6", 4611686018427387906L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21bc52ca7b7d749396f078415d782bc6");
            } else if (TextUtils.isEmpty(this.c)) {
            } else {
                com.sankuai.waimai.foundation.router.a.a(this.b, this.c);
            }
        }
    }
}
