package com.sankuai.xm.imui.common.panel.plugin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.ArrayRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.utils.p;
import com.sankuai.xm.base.trace.g;
import com.sankuai.xm.base.trace.j;
import com.sankuai.xm.base.util.ActivityUtils;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.im.message.bean.ImageMessage;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.panel.SendPanel;
import com.sankuai.xm.imui.common.panel.plugin.c;
import com.sankuai.xm.imui.common.panel.plugin.view.PageView;
import com.sankuai.xm.imui.common.util.k;
import com.sankuai.xm.imui.common.util.l;
import com.sankuai.xm.imui.session.event.d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ExtraPlugin extends Plugin implements com.sankuai.xm.imui.common.panel.plugin.a {
    public static ChangeQuickRedirect b;
    private com.sankuai.xm.imui.session.b a;
    private ViewGroup c;
    private PopupWindow d;
    private Runnable m;
    private Boolean n;
    private List<Plugin> o;

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public int getPluginIcon() {
        return R.drawable.xm_sdk_chat_plugin_btn;
    }

    public static /* synthetic */ void a(ExtraPlugin extraPlugin, final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, extraPlugin, changeQuickRedirect, false, "c53fe8512d0c7b277c05a3b3feb37eb7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, extraPlugin, changeQuickRedirect, false, "c53fe8512d0c7b277c05a3b3feb37eb7");
        } else if (extraPlugin.c != null) {
            View childAt = extraPlugin.c.getChildAt(1);
            if (ActivityUtils.a(extraPlugin.getActivity())) {
                if (extraPlugin.d != null && extraPlugin.d.isShowing()) {
                    p.b(extraPlugin.d);
                }
                extraPlugin.d = new PopupWindow((View) extraPlugin.c, -2, -2, true);
                extraPlugin.d.setOutsideTouchable(true);
                extraPlugin.d.setBackgroundDrawable(new ColorDrawable());
                extraPlugin.c.measure(0, 0);
                com.sankuai.xm.integration.imageloader.b.a(str).a(1).a(childAt);
                extraPlugin.d.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin.7
                    public static ChangeQuickRedirect a;

                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5beebf86057124c838e41dba16aa476b", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5beebf86057124c838e41dba16aa476b");
                        } else {
                            com.sankuai.xm.im.utils.b.a(com.sankuai.xm.im.utils.b.a().a("image_tip", str));
                        }
                    }
                });
                new Handler(Looper.getMainLooper()).postDelayed(j.a(new Runnable() { // from class: com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin.8
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c2965cb6b26044efa6fb89b633209a4b", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c2965cb6b26044efa6fb89b633209a4b");
                        } else if (ExtraPlugin.this.d == null || !ExtraPlugin.this.d.isShowing()) {
                        } else {
                            try {
                                p.b(ExtraPlugin.this.d);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }), 10000L);
                extraPlugin.c.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin.9
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c61690dd5e671bf0a2de5caefb394316", 6917529027641081858L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c61690dd5e671bf0a2de5caefb394316");
                            return;
                        }
                        p.b(ExtraPlugin.this.d);
                        ImageMessage a2 = com.sankuai.xm.imui.common.util.c.a(str, false);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(a2);
                        IMUIManager.a().a((List<IMMessage>) arrayList, false);
                    }
                });
                SendPanel sendPanel = extraPlugin.getSendPanel();
                if (sendPanel != null) {
                    int[] iArr = new int[2];
                    sendPanel.getLocationInWindow(iArr);
                    p.a(extraPlugin.d, sendPanel, 0, iArr[0] + 6, (iArr[1] - extraPlugin.d.getContentView().getMeasuredHeight()) - 6);
                }
            }
        }
    }

    public ExtraPlugin(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffcf0262ad4cafc4edaba13a2d35e7f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffcf0262ad4cafc4edaba13a2d35e7f0");
        }
    }

    public ExtraPlugin(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4e397dd81bed432b51b4f506c434012", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4e397dd81bed432b51b4f506c434012");
        }
    }

    public ExtraPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup viewGroup;
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88ce60ebbbf656a786560b062eb86ba7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88ce60ebbbf656a786560b062eb86ba7");
            return;
        }
        this.o = new ArrayList();
        setPluginClickClosable(true);
        setUseKeyboardHeight(false);
        if (getOptionConfigResource() == 0) {
            setOptionConfigResource(R.array.xm_sdk_extra_plugins);
        }
        this.a = com.sankuai.xm.imui.session.b.b(getContext());
        if (this.a.c.r) {
            return;
        }
        this.m = new a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7d336d2236527d93ba47b489d53729b", 6917529027641081856L)) {
            viewGroup = (ViewGroup) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7d336d2236527d93ba47b489d53729b");
        } else {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setBackgroundResource(R.drawable.xm_sdk_bg_white_round_cornor);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(getContext());
            textView.setTextSize(12.0f);
            textView.setTextColor(Color.parseColor("#333333"));
            textView.setText(R.string.xm_sdk_extra_image_quick_send_tip);
            textView.setPadding(0, 0, 0, 10);
            int applyDimension = (int) TypedValue.applyDimension(1, 63.0f, getResources().getDisplayMetrics());
            linearLayout.addView(textView, new LinearLayout.LayoutParams(applyDimension, -2));
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.xm_sdk_img_view, (ViewGroup) linearLayout, false);
            imageView.setAdjustViewBounds(true);
            imageView.setBackgroundResource(R.drawable.xm_sdk_bg_no_cornor_gray_border);
            linearLayout.addView(imageView, new LinearLayout.LayoutParams(applyDimension, applyDimension));
            viewGroup = linearLayout;
        }
        this.c = viewGroup;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a(SendPanel sendPanel) {
        Object[] objArr = {sendPanel};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d4840362c4d7b5fcd92107b79df0992", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d4840362c4d7b5fcd92107b79df0992");
            return;
        }
        super.a(sendPanel);
        if (com.sankuai.xm.base.util.b.a(this.o)) {
            setPlugins(a(getOptionConfigResource()));
        }
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final View a(final LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a23db7d980b05c26486582bfbba2a933", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a23db7d980b05c26486582bfbba2a933");
        }
        if (!com.sankuai.xm.base.util.b.a(this.o) && getSendPanel() != null) {
            for (Plugin plugin : this.o) {
                getSendPanel().a(plugin);
            }
        }
        final int b2 = k.b(getContext());
        PageView pageView = (PageView) layoutInflater.inflate(R.layout.xm_sdk_extra_panel, viewGroup, false);
        pageView.b = new PageView.a() { // from class: com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.imui.common.panel.plugin.view.PageView.a
            public final void a(int i) {
                List unmodifiableList;
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7069fdaf50507bf6f56175c63cfa4d2", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7069fdaf50507bf6f56175c63cfa4d2");
                    return;
                }
                int i2 = i * 8;
                int min = Math.min(i2 + 8, ExtraPlugin.this.o.size());
                if (i2 < min) {
                    unmodifiableList = Collections.unmodifiableList(ExtraPlugin.this.o.subList(i2, min));
                } else {
                    unmodifiableList = Collections.emptyList();
                }
                ExtraPlugin.this.a.a(new d(ExtraPlugin.this, unmodifiableList));
            }
        };
        pageView.a(com.sankuai.xm.base.util.b.b(this.o) > 8);
        pageView.a(new PagerAdapter() { // from class: com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin.2
            public static ChangeQuickRedirect a;

            @Override // android.support.v4.view.PagerAdapter
            public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
                return view == obj;
            }

            @Override // android.support.v4.view.PagerAdapter
            public int getCount() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f7ddcc8efe0979732d409ebbe502a6a", 6917529027641081856L)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f7ddcc8efe0979732d409ebbe502a6a")).intValue();
                }
                int b3 = com.sankuai.xm.base.util.b.b(ExtraPlugin.this.o);
                return (b3 / 8) + (b3 % 8 > 0 ? 1 : 0);
            }

            @Override // android.support.v4.view.PagerAdapter
            public Object instantiateItem(@NonNull ViewGroup viewGroup2, final int i) {
                Object[] objArr2 = {viewGroup2, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bda08f44381ef4c48196c7575a51f6f5", 6917529027641081856L)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bda08f44381ef4c48196c7575a51f6f5");
                }
                View inflate = layoutInflater.inflate(R.layout.xm_sdk_emotion_panel, viewGroup2, false);
                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.xm_sdk_item_list);
                recyclerView.setLayoutManager(new GridLayoutManager(ExtraPlugin.this.getContext(), 4, 1, false));
                int a2 = k.a(ExtraPlugin.this.getContext(), 26.0f);
                int dimensionPixelOffset = (((b2 - (a2 * 2)) - (ExtraPlugin.this.getResources().getDimensionPixelOffset(R.dimen.xm_sdk_extra_plugin_width) * 4)) / 3) / 2;
                if (dimensionPixelOffset > 0) {
                    int i2 = a2 - dimensionPixelOffset;
                    ((RelativeLayout.LayoutParams) recyclerView.getLayoutParams()).rightMargin = i2;
                    ((RelativeLayout.LayoutParams) recyclerView.getLayoutParams()).leftMargin = i2;
                }
                recyclerView.setOverScrollMode(2);
                recyclerView.setAdapter(new RecyclerView.a() { // from class: com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin.2.1
                    public static ChangeQuickRedirect a;

                    @Override // android.support.v7.widget.RecyclerView.a
                    public final void onBindViewHolder(@NonNull RecyclerView.s sVar, int i3) {
                    }

                    @Override // android.support.v7.widget.RecyclerView.a
                    @NonNull
                    public final RecyclerView.s onCreateViewHolder(@NonNull ViewGroup viewGroup3, int i3) {
                        View view;
                        Object[] objArr3 = {viewGroup3, Integer.valueOf(i3)};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9ff06f6e888f17568ba367b6c39abc1d", 6917529027641081856L)) {
                            return (RecyclerView.s) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9ff06f6e888f17568ba367b6c39abc1d");
                        }
                        final Plugin plugin2 = (Plugin) ExtraPlugin.this.o.get(i3);
                        l.a((View) plugin2);
                        final ExtraPlugin extraPlugin = ExtraPlugin.this;
                        LayoutInflater layoutInflater2 = layoutInflater;
                        Object[] objArr4 = {layoutInflater2, viewGroup3, plugin2};
                        ChangeQuickRedirect changeQuickRedirect4 = ExtraPlugin.b;
                        if (PatchProxy.isSupport(objArr4, extraPlugin, changeQuickRedirect4, false, "5588318dcdd02f4cc58bd698722dcfe7", 6917529027641081856L)) {
                            view = (View) PatchProxy.accessDispatch(objArr4, extraPlugin, changeQuickRedirect4, false, "5588318dcdd02f4cc58bd698722dcfe7");
                        } else {
                            final ViewGroup viewGroup4 = (ViewGroup) layoutInflater2.inflate(R.layout.xm_sdk_send_panel_plugin_extra_item, viewGroup3, false);
                            ((TextView) viewGroup4.findViewById(R.id.plugin_name)).setText(plugin2.getName());
                            ((ViewGroup) viewGroup4.findViewById(R.id.plugin_icon_container)).addView(plugin2, -1, -2);
                            extraPlugin.a(plugin2, viewGroup4);
                            viewGroup4.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin.4
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    Object[] objArr5 = {view2};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "b9ac07341e59930bc014a9880724ed3c", 6917529027641081858L)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "b9ac07341e59930bc014a9880724ed3c");
                                    } else {
                                        plugin2.ae_();
                                    }
                                }
                            });
                            plugin2.getIconView().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin.5
                                public static ChangeQuickRedirect a;

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    Object[] objArr5 = {view2};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1ae79f2ee6b4322e5adfeaf8678bf026", 6917529027641081858L)) {
                                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1ae79f2ee6b4322e5adfeaf8678bf026");
                                    } else {
                                        viewGroup4.performClick();
                                    }
                                }
                            });
                            c.a aVar = new c.a() { // from class: com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin.6
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.xm.imui.common.panel.plugin.c.a
                                public final boolean a(Plugin plugin3, int i4, Object obj) {
                                    Object[] objArr5 = {plugin3, Integer.valueOf(i4), obj};
                                    ChangeQuickRedirect changeQuickRedirect5 = a;
                                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "e1fdaac623c2aa82f3473a4e28c57dec", 6917529027641081856L)) {
                                        return ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "e1fdaac623c2aa82f3473a4e28c57dec")).booleanValue();
                                    }
                                    if (i4 == 524288) {
                                        ExtraPlugin.this.a(plugin3, viewGroup4);
                                    }
                                    return false;
                                }
                            };
                            Object[] objArr5 = {aVar};
                            ChangeQuickRedirect changeQuickRedirect5 = Plugin.e;
                            if (PatchProxy.isSupport(objArr5, plugin2, changeQuickRedirect5, false, "766a227b17e9795cb4da33fe9810386b", 6917529027641081856L)) {
                                PatchProxy.accessDispatch(objArr5, plugin2, changeQuickRedirect5, false, "766a227b17e9795cb4da33fe9810386b");
                            } else {
                                plugin2.l.add(aVar);
                            }
                            view = viewGroup4;
                        }
                        return new com.sankuai.xm.imui.common.view.a(view);
                    }

                    @Override // android.support.v7.widget.RecyclerView.a
                    public final int getItemViewType(int i3) {
                        return (i * 8) + i3;
                    }

                    @Override // android.support.v7.widget.RecyclerView.a
                    public final int getItemCount() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "87656b609f6e4166e175e93d67d9d401", 6917529027641081856L)) {
                            return ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "87656b609f6e4166e175e93d67d9d401")).intValue();
                        }
                        int b3 = com.sankuai.xm.base.util.b.b(ExtraPlugin.this.o);
                        if (b3 / 8 > i) {
                            return 8;
                        }
                        return b3 % 8;
                    }
                });
                viewGroup2.addView(inflate);
                return inflate;
            }

            @Override // android.support.v4.view.PagerAdapter
            public void destroyItem(@NonNull ViewGroup viewGroup2, int i, @NonNull Object obj) {
                Object[] objArr2 = {viewGroup2, Integer.valueOf(i), obj};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c13468fa7fbe590a5eeb35538213f73", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c13468fa7fbe590a5eeb35538213f73");
                } else {
                    viewGroup2.removeView((View) obj);
                }
            }
        });
        return pageView;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void a() {
        boolean z;
        boolean z2 = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaa7a56ac91a9ef13f4d5cca21a544ba", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaa7a56ac91a9ef13f4d5cca21a544ba");
            return;
        }
        b(1);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e12cd5a412c206c4655bb74ef5debe2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e12cd5a412c206c4655bb74ef5debe2");
        } else {
            if (this.n == null) {
                if (!com.sankuai.xm.imui.session.b.b(getContext()).c.r) {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = b;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "561b49c07a96cc5a3518d5f46863e3a2", 6917529027641081856L)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "561b49c07a96cc5a3518d5f46863e3a2")).booleanValue();
                    } else {
                        if (!com.sankuai.xm.base.util.b.a(this.o)) {
                            for (Plugin plugin : this.o) {
                                if (plugin instanceof PhotoPlugin) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        z = false;
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                this.n = Boolean.valueOf(z2);
            }
            if (this.n.booleanValue()) {
                com.sankuai.xm.threadpool.scheduler.a.b().b(this.m);
            }
        }
        getOptionView().post(j.a(new Runnable() { // from class: com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "779aaaf5ad78816329441da230f1f016", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "779aaaf5ad78816329441da230f1f016");
                } else {
                    ((PageView) ExtraPlugin.this.getOptionView()).a();
                }
            }
        }));
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb17de13f85cd6d19282b3dd530832bb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb17de13f85cd6d19282b3dd530832bb");
            return;
        }
        b(0);
        if (com.sankuai.xm.base.util.b.a(this.o)) {
            return;
        }
        for (Plugin plugin : this.o) {
            if (plugin != null && plugin.i) {
                plugin.h();
            }
        }
    }

    public void setPlugins(List<Plugin> list) {
        int indexOfValue;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "282eb2532c10c70689008f3e3f97f235", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "282eb2532c10c70689008f3e3f97f235");
        } else if (this.o != list) {
            if (!com.sankuai.xm.base.util.b.a(this.o) && getSendPanel() != null) {
                for (Plugin plugin : this.o) {
                    SendPanel sendPanel = getSendPanel();
                    Object[] objArr2 = {plugin};
                    ChangeQuickRedirect changeQuickRedirect2 = SendPanel.a;
                    if (PatchProxy.isSupport(objArr2, sendPanel, changeQuickRedirect2, false, "c997631d381e7fc5f0be65312ae16f35", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, sendPanel, changeQuickRedirect2, false, "c997631d381e7fc5f0be65312ae16f35");
                    } else {
                        if (plugin != null && (indexOfValue = sendPanel.c.indexOfValue(plugin)) != -1) {
                            sendPanel.c.removeAt(indexOfValue);
                        }
                        if (plugin != null) {
                            plugin.f();
                        }
                    }
                }
            }
            this.o = list;
            try {
                Class<?> a2 = com.sankuai.xm.imui.common.util.a.a(getContext(), Plugin.class);
                if (a2 != null) {
                    if (this.o == null) {
                        this.o = new ArrayList();
                    }
                    this.o.add(a(a2));
                }
            } catch (Exception unused) {
            }
            if (this.j) {
                j();
            }
        }
    }

    public List<Plugin> getPlugins() {
        return this.o;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.Plugin
    public String getPluginName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e662387de8709fac756ba2e2a65a30b", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e662387de8709fac756ba2e2a65a30b") : getResources().getString(R.string.xm_sdk_app_plugin_extra);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Plugin plugin, ViewGroup viewGroup) {
        Object[] objArr = {plugin, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ebbe4aa2cee25bc7af6e08df5f708d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ebbe4aa2cee25bc7af6e08df5f708d4");
            return;
        }
        View findViewById = viewGroup.findViewById(R.id.plugin_corner_mark);
        if (findViewById == null) {
            com.sankuai.xm.imui.common.util.d.c("ExtraPlugin::defaultPluginCornerMarkSetup cannot find plugin_corner_mark", new Object[0]);
            return;
        }
        int cornerMark = plugin.getCornerMark();
        if (cornerMark != 0) {
            if (findViewById instanceof ViewStub) {
                findViewById = ((ViewStub) findViewById).inflate();
            }
            findViewById.setVisibility(0);
            findViewById.setTag(R.id.plugin_corner_mark, Integer.valueOf(cornerMark));
            plugin.setTag(R.id.plugin_corner_mark, findViewById);
            Drawable b2 = android.support.v7.content.res.b.b(getContext(), cornerMark);
            findViewById.setBackground(b2);
            if (b2 != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
                layoutParams.topMargin -= b2.getMinimumWidth() / 2;
                layoutParams.rightMargin -= b2.getMinimumHeight() / 2;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
                return;
            }
            return;
        }
        findViewById.setVisibility(8);
    }

    private List<Plugin> a(@ArrayRes int i) {
        ArrayList arrayList;
        String[] stringArray;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10083e70d1c9417fa27e384d592441d5", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10083e70d1c9417fa27e384d592441d5");
        }
        try {
            stringArray = getResources().getStringArray(i);
            arrayList = new ArrayList(stringArray.length);
        } catch (Exception e) {
            e = e;
            arrayList = null;
        }
        try {
            for (String str : stringArray) {
                Plugin a2 = a(Class.forName(str));
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        } catch (Exception e2) {
            e = e2;
            com.sankuai.xm.monitor.statistics.a.a("imui", "ExtraPlugin::createPlugins", e);
            com.sankuai.xm.imui.common.util.d.a(e);
            return arrayList;
        }
        return arrayList;
    }

    private Plugin a(Class<?> cls) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98f7950ea30ac8f32408e9ca9d87ac58", 6917529027641081856L)) {
            return (Plugin) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98f7950ea30ac8f32408e9ca9d87ac58");
        }
        if (Plugin.class.isAssignableFrom(cls)) {
            Constructor<?> constructor = cls.getConstructor(Context.class, AttributeSet.class);
            return constructor != null ? (Plugin) constructor.newInstance(getContext(), null) : (Plugin) cls.getConstructor(Context.class).newInstance(getContext());
        }
        return null;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class a implements Runnable {
        public static ChangeQuickRedirect a;
        private g c;

        private a() {
            Object[] objArr = {ExtraPlugin.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b662760fd725275e6cd377ee67de3638", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b662760fd725275e6cd377ee67de3638");
            } else {
                this.c = j.a();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
            if (com.sankuai.xm.base.util.k.p(r3) > 0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00dd, code lost:
            r3 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00ec, code lost:
            if (android.text.TextUtils.equals(com.sankuai.xm.im.utils.b.a().getString("image_tip", null), r3) == false) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ef, code lost:
            r4 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00f1, code lost:
            r4 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00f2, code lost:
            r4 = r1;
            r1 = r3;
            r3 = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0109, code lost:
            com.sankuai.xm.monitor.statistics.a.a("imui", "ExtraPlugin::QueryPictureRunnable", r3);
            com.sankuai.xm.imui.common.util.d.a(r3);
            com.sankuai.xm.monitor.statistics.a.a("imui", "ExtraPlugin::QueryPictureRunnable", r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x011a, code lost:
            com.sankuai.xm.base.util.m.a(r4);
            r1 = r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:51:0x011f A[Catch: Throwable -> 0x0157, TryCatch #4 {Throwable -> 0x0157, blocks: (B:6:0x0018, B:8:0x0025, B:10:0x0043, B:16:0x007a, B:49:0x011a, B:51:0x011f, B:52:0x0142, B:38:0x00f7, B:54:0x0148, B:55:0x0150, B:11:0x004e, B:56:0x0151), top: B:67:0x0018 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 350
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.imui.common.panel.plugin.ExtraPlugin.a.run():void");
        }
    }
}
