package com.sankuai.waimai.business.im.common.plugin.smartreply;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.im.common.model.f;
import com.sankuai.waimai.business.im.common.plugin.smartreply.a;
import com.sankuai.waimai.business.im.utils.d;
import com.sankuai.waimai.imbase.dialog.IMCustomDialog;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.xm.base.util.ad;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.IMUIManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends RelativeLayout {
    public static ChangeQuickRedirect a;
    f[] b;
    TextView c;
    int d;
    public int e;
    String f;
    public a g;
    public ListView h;
    public b i;
    private String[] j;
    private int k;
    private c l;

    public e(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05d17e3ec43965efafd1648e07406f6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05d17e3ec43965efafd1648e07406f6e");
            return;
        }
        this.d = 10;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f42889a186c5b2170b5c4b7df613b4da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f42889a186c5b2170b5c4b7df613b4da");
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.wm_im_layout_smart_reply, (ViewGroup) this, true);
        this.h = (ListView) findViewById(R.id.listview_im_smart_reply);
        this.h.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.sankuai.waimai.business.im.common.plugin.smartreply.e.1
            public static ChangeQuickRedirect a;

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                Object[] objArr3 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f4f3ca61fc4995fc34bffe90da9eaa02", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f4f3ca61fc4995fc34bffe90da9eaa02");
                    return;
                }
                String item = e.this.g.getItem(i);
                if (item == null) {
                    return;
                }
                IMUIManager.a().a((IMMessage) com.sankuai.xm.imui.common.util.c.a(item), false);
                boolean a2 = e.this.g.a(i);
                d.a aVar = new d.a();
                aVar.a("word_type", Integer.valueOf(1 ^ a2));
                e.this.a(aVar);
                JudasManualManager.a(com.sankuai.waimai.business.im.utils.d.d).a(aVar.a()).a(com.sankuai.waimai.business.im.utils.d.a).a();
            }
        });
        this.h.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: com.sankuai.waimai.business.im.common.plugin.smartreply.e.2
            public static ChangeQuickRedirect a;

            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, final long j) {
                TextView textView;
                Object[] objArr3 = {adapterView, view, Integer.valueOf(i), new Long(j)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "16eeb09fb2bd516e47f6345dc7e9846b", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "16eeb09fb2bd516e47f6345dc7e9846b")).booleanValue();
                }
                if (!e.this.g.a(i)) {
                    ad.a(e.this.getContext(), "默认常用语暂不支持删除");
                    return true;
                }
                IMCustomDialog a2 = new IMCustomDialog.a(e.this.getContext()).a("是否删除该常用语?").a(e.this.getResources().getString(R.string.wm_im_cancel), (DialogInterface.OnClickListener) null).b("删除", new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.plugin.smartreply.e.2.1
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        Object[] objArr4 = {dialogInterface, Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "f6a653114c79d3dc4224d2244e546355", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "f6a653114c79d3dc4224d2244e546355");
                        } else if (e.this.i != null) {
                            e.this.i.a(e.this.k, j);
                        }
                    }
                }).a();
                if (a2 != null && (textView = a2.b) != null) {
                    textView.setTypeface(Typeface.defaultFromStyle(1));
                    textView.setTextColor(e.this.getResources().getColorStateList(R.color.wm_im_btn_highlight));
                }
                return true;
            }
        });
        this.g = new a(getContext());
        this.h.setAdapter((ListAdapter) this.g);
    }

    public final void setSmartReplyAction(b bVar) {
        this.i = bVar;
    }

    public final void setPhfLabBuilder(c cVar) {
        this.l = cVar;
    }

    public final void setSystemPhrases(String[] strArr) {
        this.j = strArr;
    }

    public final void setMaxCustomCount(int i) {
        this.d = i;
    }

    public final void setMaxCustomContentLength(int i) {
        this.e = i;
    }

    public final void setCustomHint(String str) {
        this.f = str;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12f156d0868cdc5ae6882fd4a5f0ca3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12f156d0868cdc5ae6882fd4a5f0ca3d");
        } else if (this.c == null) {
        } else {
            this.c.setEnabled(z);
        }
    }

    public final void setCustomPhrases(f[] fVarArr) {
        this.b = fVarArr;
    }

    public final f[] getCustomPhrases() {
        return this.b;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89621afe789677229c651aafe8381cb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89621afe789677229c651aafe8381cb1");
        } else if (this.g != null) {
            this.g.notifyDataSetChanged();
        }
    }

    public final void setIMType(int i) {
        this.k = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "066d6921da1ddc677872affb4ec57302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "066d6921da1ddc677872affb4ec57302");
        } else if (this.l == null || aVar == null) {
        } else {
            this.l.a(aVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends BaseAdapter {
        public static ChangeQuickRedirect a;
        public final LayoutInflater b;

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return 3;
        }

        public a(Context context) {
            Object[] objArr = {e.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40740aeff2b4bca8fba06fb979eb8851", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40740aeff2b4bca8fba06fb979eb8851");
            } else {
                this.b = LayoutInflater.from(context);
            }
        }

        private int a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f344fd4eae7abc69045381d3e4b91dfe", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f344fd4eae7abc69045381d3e4b91dfe")).intValue();
            }
            if (e.this.j == null) {
                return 0;
            }
            return e.this.j.length;
        }

        private int b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbad66be2e5b6669135be41001e565bc", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbad66be2e5b6669135be41001e565bc")).intValue();
            }
            if (e.this.b == null) {
                return 0;
            }
            return e.this.b.length;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d013752f94044727bbf2bd11f3a1424", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d013752f94044727bbf2bd11f3a1424")).intValue() : b() + 1 + a();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "756f4a89152d7d8ef8e9538bca2f38f2", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "756f4a89152d7d8ef8e9538bca2f38f2")).intValue();
            }
            if (i == 0) {
                return 0;
            }
            return a(i) ? 1 : 2;
        }

        public final boolean a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25be3877a76c0f7a6ecd23b2a1fce93d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25be3877a76c0f7a6ecd23b2a1fce93d")).booleanValue() : i > 0 && i < b() + 1;
        }

        private int c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2933d7ee8a63f60aecd1f9b4d6d4e00", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2933d7ee8a63f60aecd1f9b4d6d4e00")).intValue() : b() + 1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public final String getItem(int i) {
            int i2;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a48f33cf0e367a6f4203ed74bd56aab4", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a48f33cf0e367a6f4203ed74bd56aab4");
            }
            if (!a(i) || i - 1 < 0 || i2 >= b()) {
                int c = i - c();
                if (c < 0 || c >= a()) {
                    return null;
                }
                return e.this.j[c];
            }
            return e.this.b[i2].b;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            int i2;
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40229da750d31ca5f4f78bf1678033ef", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40229da750d31ca5f4f78bf1678033ef")).longValue() : (!a(i) || (i2 = i + (-1)) < 0 || i2 >= b()) ? i : e.this.b[i2].a;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            Object[] objArr = {Integer.valueOf(i), view, viewGroup};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab85effe19a1e7d739bd7746ab296507", RobustBitConfig.DEFAULT_VALUE)) {
                return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab85effe19a1e7d739bd7746ab296507");
            }
            switch (getItemViewType(i)) {
                case 0:
                    if (view == null) {
                        view = this.b.inflate(R.layout.wm_im_layout_smart_reply_add, viewGroup, false);
                    }
                    view.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.plugin.smartreply.e.a.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            TextView textView;
                            Object[] objArr2 = {view2};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3904646a29d62fa315fe582109959a61", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3904646a29d62fa315fe582109959a61");
                                return;
                            }
                            final e eVar = e.this;
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = e.a;
                            if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "d9d005385e1ccba15893aa3d9230b393", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "d9d005385e1ccba15893aa3d9230b393");
                                return;
                            }
                            d.a aVar = new d.a();
                            eVar.a(aVar);
                            JudasManualManager.a(com.sankuai.waimai.business.im.utils.d.o).a(com.sankuai.waimai.business.im.utils.d.a).a(aVar.a()).a();
                            if (eVar.b != null && eVar.b.length >= eVar.d) {
                                IMCustomDialog.a b = new IMCustomDialog.a(eVar.getContext()).a(com.sankuai.waimai.imbase.utils.b.a(eVar.getContext(), 24.0f), com.sankuai.waimai.imbase.utils.b.a(eVar.getContext(), 24.0f)).b("添加自动回复文案已达到上限");
                                b.b.h = -7829368;
                                b.b(eVar.getResources().getString(R.string.wm_im_i_know), null).a();
                                return;
                            }
                            final com.sankuai.waimai.business.im.common.plugin.smartreply.a aVar2 = new com.sankuai.waimai.business.im.common.plugin.smartreply.a(eVar.getContext());
                            aVar2.setContentHint(eVar.f);
                            aVar2.setMaxContentLength(eVar.e);
                            aVar2.setTextValidChangedListener(new a.InterfaceC0734a() { // from class: com.sankuai.waimai.business.im.common.plugin.smartreply.e.3
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.business.im.common.plugin.smartreply.a.InterfaceC0734a
                                public final void a(boolean z) {
                                    Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d4e9bf22692c0330256a18544cfa42c4", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d4e9bf22692c0330256a18544cfa42c4");
                                    } else {
                                        e.this.a(z);
                                    }
                                }
                            });
                            aVar2.requestFocus();
                            IMCustomDialog.a a2 = new IMCustomDialog.a(eVar.getContext()).a(com.sankuai.waimai.imbase.utils.b.a(eVar.getContext(), 20.0f), com.sankuai.waimai.imbase.utils.b.a(eVar.getContext(), 12.0f)).a("添加常用语");
                            a2.b.m = aVar2;
                            IMCustomDialog.a a3 = a2.a(eVar.getResources().getString(R.string.wm_im_cancel), new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.plugin.smartreply.e.5
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    Object[] objArr4 = {dialogInterface, Integer.valueOf(i2)};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cdd70f981ce78a2c8847ff603b37e1f6", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cdd70f981ce78a2c8847ff603b37e1f6");
                                        return;
                                    }
                                    d.a aVar3 = new d.a();
                                    e.this.a(aVar3);
                                    JudasManualManager.a(com.sankuai.waimai.business.im.utils.d.q).a(aVar3.a()).a(com.sankuai.waimai.business.im.utils.d.a).a();
                                }
                            }).a("确认添加", false, new DialogInterface.OnClickListener() { // from class: com.sankuai.waimai.business.im.common.plugin.smartreply.e.4
                                public static ChangeQuickRedirect a;

                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    boolean z = false;
                                    Object[] objArr4 = {dialogInterface, Integer.valueOf(i2)};
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3efc1cf71d3bf075ca96b90553d05857", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3efc1cf71d3bf075ca96b90553d05857");
                                        return;
                                    }
                                    d.a aVar3 = new d.a();
                                    e.this.a(aVar3);
                                    JudasManualManager.a(com.sankuai.waimai.business.im.utils.d.p).a(aVar3.a()).a(com.sankuai.waimai.business.im.utils.d.a).a();
                                    com.sankuai.waimai.business.im.common.plugin.smartreply.a aVar4 = aVar2;
                                    Object[] objArr5 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.im.common.plugin.smartreply.a.a;
                                    if (PatchProxy.isSupport(objArr5, aVar4, changeQuickRedirect5, false, "25169d49bbd7cb1991283afe0f572d75", RobustBitConfig.DEFAULT_VALUE)) {
                                        z = ((Boolean) PatchProxy.accessDispatch(objArr5, aVar4, changeQuickRedirect5, false, "25169d49bbd7cb1991283afe0f572d75")).booleanValue();
                                    } else if (aVar4.b != null && aVar4.b.length() > 0 && aVar4.b.length() <= aVar4.c) {
                                        z = true;
                                    }
                                    if (z) {
                                        String content = aVar2.getContent();
                                        if (e.this.i != null) {
                                            e.this.i.a(e.this.k, content);
                                        }
                                        dialogInterface.dismiss();
                                    }
                                }
                            });
                            a3.b.I = true;
                            IMCustomDialog a4 = a3.a(false).a();
                            if (a4 != null && (textView = a4.b) != null) {
                                eVar.c = textView;
                                eVar.c.setTypeface(Typeface.defaultFromStyle(1));
                                eVar.c.setTextColor(eVar.getResources().getColorStateList(R.color.wm_im_btn_highlight));
                            }
                            eVar.a(false);
                        }
                    });
                    break;
                case 1:
                    if (view == null) {
                        view = this.b.inflate(R.layout.wm_im_layout_smart_reply_item, viewGroup, false);
                    }
                    ((TextView) view.findViewById(R.id.tv_im_smart_reply_content)).setText(getItem(i));
                    break;
                case 2:
                    if (view == null) {
                        view = this.b.inflate(R.layout.wm_im_layout_smart_reply_item, viewGroup, false);
                    }
                    ((TextView) view.findViewById(R.id.tv_im_smart_reply_content)).setText(getItem(i));
                    break;
            }
            return view;
        }
    }
}
