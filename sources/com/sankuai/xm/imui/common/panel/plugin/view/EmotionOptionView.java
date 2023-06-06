package com.sankuai.xm.imui.common.panel.plugin.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.waimai.platform.utils.p;
import com.sankuai.xm.base.service.m;
import com.sankuai.xm.im.message.bean.IMMessage;
import com.sankuai.xm.imui.IMUIManager;
import com.sankuai.xm.imui.common.entity.a;
import com.sankuai.xm.imui.common.panel.SendPanel;
import com.sankuai.xm.imui.common.panel.plugin.EmotionPlugin;
import com.sankuai.xm.imui.common.panel.plugin.InputEditorPlugin;
import com.sankuai.xm.imui.common.panel.plugin.view.PageView;
import com.sankuai.xm.imui.common.panel.plugin.view.TabPagerView;
import com.sankuai.xm.imui.common.processors.f;
import com.sankuai.xm.imui.common.util.d;
import com.sankuai.xm.imui.common.util.k;
import com.sankuai.xm.imui.common.view.AdaptiveImageView;
import com.sankuai.xm.ui.service.b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class EmotionOptionView extends TabPagerView<com.sankuai.xm.imui.common.entity.a> {
    public static ChangeQuickRedirect a;
    private LayoutInflater e;
    private PopupWindow f;
    private com.sankuai.xm.imui.session.b g;

    public static /* synthetic */ com.sankuai.xm.imui.common.entity.a a(EmotionOptionView emotionOptionView, com.sankuai.xm.imui.common.entity.a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, emotionOptionView, changeQuickRedirect, false, "7e52716ca35f5e34cc8d45b269f27974", 6917529027641081856L)) {
            return (com.sankuai.xm.imui.common.entity.a) PatchProxy.accessDispatch(objArr, emotionOptionView, changeQuickRedirect, false, "7e52716ca35f5e34cc8d45b269f27974");
        }
        com.sankuai.xm.imui.common.entity.a aVar2 = new com.sankuai.xm.imui.common.entity.a();
        aVar2.d = aVar.d;
        aVar2.e = aVar.e;
        aVar2.h = aVar.h;
        aVar2.i = aVar.i;
        String string = com.sankuai.xm.im.utils.b.a().getString(emotionOptionView.a(aVar), "");
        if (!TextUtils.isEmpty(string)) {
            List asList = Arrays.asList(string.split(CommonConstant.Symbol.COMMA));
            if (!com.sankuai.xm.base.util.b.a((Collection<?>) asList)) {
                for (int i2 = 0; i2 < asList.size() && i2 < i; i2++) {
                    a.C1398a a2 = aVar.a((String) asList.get(i2));
                    if (a2 != null) {
                        aVar2.m.add(a2);
                    }
                }
            }
        }
        return aVar2;
    }

    public static /* synthetic */ boolean a(EmotionOptionView emotionOptionView, com.sankuai.xm.imui.common.entity.a aVar, a.C1398a c1398a, int i) {
        Object[] objArr = {aVar, c1398a, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, emotionOptionView, changeQuickRedirect, false, "0cca11ceb60a8c8d60409bdd4c4ed484", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, emotionOptionView, changeQuickRedirect, false, "0cca11ceb60a8c8d60409bdd4c4ed484")).booleanValue();
        }
        if (aVar == null || c1398a == null) {
            return false;
        }
        if (aVar.m.size() <= 0 || !TextUtils.equals(aVar.m.get(0).c, c1398a.c)) {
            aVar.m.remove(c1398a);
            aVar.m.add(0, c1398a);
            if (i > 0 && aVar.m.size() > i) {
                aVar.m.remove(aVar.m.size() - 1);
            }
            String a2 = emotionOptionView.a(aVar);
            StringBuilder sb = new StringBuilder();
            Iterator<a.C1398a> it = aVar.m.iterator();
            while (it.hasNext()) {
                sb.append(it.next().c);
                if (it.hasNext()) {
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
            com.sankuai.xm.im.utils.b.a(com.sankuai.xm.im.utils.b.a().a(a2, sb.toString()));
            return true;
        }
        return false;
    }

    @Override // com.sankuai.xm.imui.common.panel.plugin.view.TabPagerView
    public final /* synthetic */ View a(@NonNull ViewGroup viewGroup, int i, com.sankuai.xm.imui.common.entity.a aVar) {
        int i2;
        int a2;
        final com.sankuai.xm.imui.common.entity.a aVar2 = aVar;
        Object[] objArr = {viewGroup, Integer.valueOf(i), aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f314365118267bd1721dd6a621d681e", 6917529027641081856L)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f314365118267bd1721dd6a621d681e");
        }
        if (aVar2.d == 1) {
            i2 = k.b(getContext()) > k.a(getContext(), 390.0f) ? 9 : 8;
        } else {
            i2 = 5;
        }
        View inflate = this.e.inflate(R.layout.xm_sdk_emotion_panel, viewGroup, false);
        final ImageView imageView = (ImageView) inflate.findViewById(R.id.xm_sdk_btn_del);
        View findViewById = inflate.findViewById(R.id.xm_sdk_btn_del_mask);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.xm_sdk_item_list);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), i2, 1, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setOverScrollMode(2);
        final a aVar3 = new a(aVar2, i2);
        recyclerView.setAdapter(aVar3);
        gridLayoutManager.g = new GridLayoutManager.c() { // from class: com.sankuai.xm.imui.common.panel.plugin.view.EmotionOptionView.2
            public static ChangeQuickRedirect b;

            @Override // android.support.v7.widget.GridLayoutManager.c
            public final int a(int i3) {
                Object[] objArr2 = {Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2febddf243df834c2a040cb58925e6e6", 6917529027641081856L)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2febddf243df834c2a040cb58925e6e6")).intValue();
                }
                a aVar4 = aVar3;
                Object[] objArr3 = {Integer.valueOf(i3)};
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar4, changeQuickRedirect3, false, "7891c3e5996661c77425c1cb58934802", 6917529027641081856L)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr3, aVar4, changeQuickRedirect3, false, "7891c3e5996661c77425c1cb58934802")).intValue();
                }
                if (aVar4.getItemViewType(i3) == 0) {
                    return aVar4.b;
                }
                return 1;
            }
        };
        if (aVar2.d == 1) {
            a2 = k.a(getContext(), 10.0f);
            findViewById.setVisibility(0);
            findViewById.setBackground(android.support.v7.content.res.b.b(getContext(), R.drawable.xm_sdk_vd_del_btn_mask));
            imageView.setVisibility(0);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.common.panel.plugin.view.EmotionOptionView.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d55977027f5cf02479f7e553fb96911", 6917529027641081858L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d55977027f5cf02479f7e553fb96911");
                        return;
                    }
                    InputEditorPlugin inputEditorPlugin = (InputEditorPlugin) com.sankuai.xm.imui.session.b.a(view, InputEditorPlugin.class);
                    if (inputEditorPlugin == null || inputEditorPlugin.getEditText() == null) {
                        return;
                    }
                    inputEditorPlugin.getEditText().dispatchKeyEvent(new KeyEvent(0, 67));
                }
            });
            com.sankuai.xm.imui.common.panel.plugin.b bVar = (com.sankuai.xm.imui.common.panel.plugin.b) com.sankuai.xm.imui.session.b.a(this, com.sankuai.xm.imui.common.panel.plugin.b.class);
            if (bVar != null) {
                bVar.getEditText().addTextChangedListener(new TextWatcher() { // from class: com.sankuai.xm.imui.common.panel.plugin.view.EmotionOptionView.4
                    public static ChangeQuickRedirect a;

                    @Override // android.text.TextWatcher
                    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                    }

                    @Override // android.text.TextWatcher
                    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                    }

                    @Override // android.text.TextWatcher
                    public final void afterTextChanged(Editable editable) {
                        Object[] objArr2 = {editable};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af927068913e0c7bd228fbedd355fe3c", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af927068913e0c7bd228fbedd355fe3c");
                        } else {
                            EmotionOptionView.this.a(imageView, editable);
                        }
                    }
                });
                a(imageView, bVar.getEditText().getText());
            }
        } else {
            a2 = k.a(getContext(), 15.0f);
            imageView.setVisibility(8);
            findViewById.setVisibility(8);
        }
        recyclerView.setPadding(a2, 0, a2, 0);
        recyclerView.addItemDecoration(new RecyclerView.f() { // from class: com.sankuai.xm.imui.common.panel.plugin.view.EmotionOptionView.5
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.f
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView2, RecyclerView.State state) {
                int i3;
                int i4;
                Object[] objArr2 = {rect, view, recyclerView2, state};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c20c134d815753bf5d76f3ea7e5f7255", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c20c134d815753bf5d76f3ea7e5f7255");
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView2, state);
                int[] a3 = aVar3.a(recyclerView2.getChildAdapterPosition(view));
                a aVar4 = aVar3;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a.a;
                if (PatchProxy.isSupport(objArr3, aVar4, changeQuickRedirect3, false, "f25a1c4317cbc7955c67ba48df47cabb", 6917529027641081856L)) {
                    i4 = ((Integer) PatchProxy.accessDispatch(objArr3, aVar4, changeQuickRedirect3, false, "f25a1c4317cbc7955c67ba48df47cabb")).intValue();
                    i3 = 1;
                } else {
                    i3 = 1;
                    i4 = aVar4.a(aVar4.getItemCount() - 1)[0] + 1;
                }
                if (aVar2.d == i3) {
                    if (a3[0] == i4 - i3) {
                        rect.bottom = k.a(view.getContext(), 78.0f);
                    }
                    if (a3[0] == 0) {
                        rect.top = k.a(view.getContext(), 16.0f);
                    }
                } else if (a3[0] == i4 - 1) {
                    rect.bottom = k.a(view.getContext(), 15.0f);
                }
            }
        });
        return inflate;
    }

    public EmotionOptionView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02ba8e73a588efceff71f97ac5671bdf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02ba8e73a588efceff71f97ac5671bdf");
        }
    }

    private EmotionOptionView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71a7e404093d44bda8c32cfbee9d8966", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71a7e404093d44bda8c32cfbee9d8966");
        }
    }

    public EmotionOptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e62c7ee1c6873823dade74a44a787c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e62c7ee1c6873823dade74a44a787c7");
            return;
        }
        setGravity(17);
        setMinimumHeight(k.a(context, 364.0f));
        this.g = com.sankuai.xm.imui.session.b.b(context);
    }

    public final void a(final EmotionPlugin emotionPlugin) {
        Object[] objArr = {emotionPlugin};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "158c2601f421c88e61999537915a708f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "158c2601f421c88e61999537915a708f");
            return;
        }
        this.e = LayoutInflater.from(getContext());
        a(emotionPlugin.getEmotionsForPanel());
        setTabBarAdapter(new b());
        this.d.a(false);
        this.d.b = new PageView.a() { // from class: com.sankuai.xm.imui.common.panel.plugin.view.EmotionOptionView.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.xm.imui.common.panel.plugin.view.PageView.a
            public final void a(int i) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01e23ee55d44ed895c58d32b5db08482", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01e23ee55d44ed895c58d32b5db08482");
                    return;
                }
                com.sankuai.xm.imui.common.entity.a aVar = com.sankuai.xm.base.util.b.b(EmotionOptionView.this.getData()) >= i + 1 ? EmotionOptionView.this.getData().get(i) : null;
                if (aVar != null) {
                    EmotionOptionView.this.g.a(new com.sankuai.xm.imui.session.event.c(emotionPlugin, aVar));
                }
            }
        };
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "927c398d1e907feeef650044558abde7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "927c398d1e907feeef650044558abde7");
        } else if (this.d != null) {
            this.d.a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    final class b extends TabPagerView<com.sankuai.xm.imui.common.entity.a>.b {
        public static ChangeQuickRedirect a;

        private b() {
            super();
            Object[] objArr = {EmotionOptionView.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0410da86b505c94b6f7bd6faab1b32f5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0410da86b505c94b6f7bd6faab1b32f5");
            }
        }

        @Override // com.sankuai.xm.imui.common.panel.plugin.view.TabPagerView.b
        public final /* synthetic */ void a(@NonNull TabPagerView.a aVar, int i, com.sankuai.xm.imui.common.entity.a aVar2) {
            com.sankuai.xm.imui.common.entity.a aVar3 = aVar2;
            Object[] objArr = {aVar, Integer.valueOf(i), aVar3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a8181f40a3d29c3c2872aab54f3fbcc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a8181f40a3d29c3c2872aab54f3fbcc");
            } else if (aVar3 != null) {
                AdaptiveImageView adaptiveImageView = (AdaptiveImageView) aVar.b;
                adaptiveImageView.b = false;
                if (aVar3.b != 0 && aVar3.b != -1) {
                    adaptiveImageView.setImageResource(aVar3.b);
                } else if (TextUtils.isEmpty(aVar3.c)) {
                } else {
                    adaptiveImageView.setPlaceHolderRes(R.drawable.xm_sdk_chat_msg_img_loading);
                    adaptiveImageView.setErrorRes(R.drawable.xm_sdk_chat_msg_emotion_failed);
                    adaptiveImageView.setImageResource(com.sankuai.xm.integration.imageloader.utils.a.b(aVar3.c));
                }
            }
        }

        @Override // com.sankuai.xm.imui.common.panel.plugin.view.TabPagerView.b
        public final TabPagerView.a a(@NonNull ViewGroup viewGroup, int i) {
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dad762c675886d2c29d94176dfd0a4a", 6917529027641081856L) ? (TabPagerView.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dad762c675886d2c29d94176dfd0a4a") : new TabPagerView.a(EmotionOptionView.this.e.inflate(R.layout.xm_sdk_send_panel_option_view_tab_item, viewGroup, false), R.id.xm_sdk_tab_img);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ImageView imageView, Editable editable) {
        Object[] objArr = {imageView, editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a4e9e9ed9a1989081f6398061da0757", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a4e9e9ed9a1989081f6398061da0757");
        } else if ((!TextUtils.isEmpty(editable)) == imageView.isEnabled()) {
        } else {
            imageView.setEnabled(!TextUtils.isEmpty(editable));
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                if (!imageView.isEnabled()) {
                    drawable.setColorFilter(new PorterDuffColorFilter(SendPanel.b, PorterDuff.Mode.SRC_ATOP));
                } else {
                    drawable.setColorFilter(null);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    class a extends RecyclerView.a<c> {
        public static ChangeQuickRedirect a;
        int b;
        public final com.sankuai.xm.imui.common.entity.a c;
        public final com.sankuai.xm.imui.common.entity.a d;
        public final com.sankuai.xm.imui.common.entity.a e;

        @Override // android.support.v7.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(@NonNull c cVar, int i) {
            final a.C1398a c1398a;
            final c cVar2 = cVar;
            Object[] objArr = {cVar2, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6178fef3ba05ce724eff951c4a91f28", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6178fef3ba05ce724eff951c4a91f28");
            } else if (getItemViewType(i) == 0) {
                TextView textView = (TextView) cVar2.itemView;
                if (i == 0) {
                    textView.setText(R.string.xm_sdk_emotion_recent);
                } else {
                    textView.setText(R.string.xm_sdk_emotion_all);
                }
            } else {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e9a84c867f629d44812f114f00c8994", 6917529027641081856L)) {
                    c1398a = (a.C1398a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e9a84c867f629d44812f114f00c8994");
                } else {
                    int b = com.sankuai.xm.base.util.b.b(this.d.m);
                    if (b <= 0) {
                        c1398a = this.c.m.get(i);
                    } else if (i == 0 || i == b + 1) {
                        c1398a = null;
                    } else if (i <= b) {
                        c1398a = this.d.m.get(i - 1);
                    } else {
                        c1398a = this.c.m.get((i - 2) - b);
                    }
                }
                if (c1398a != null) {
                    final int i2 = i % this.b;
                    AdaptiveImageView adaptiveImageView = (AdaptiveImageView) cVar2.b;
                    adaptiveImageView.b = false;
                    if (c1398a.b != -1 && c1398a.b != 0) {
                        adaptiveImageView.setImageResource(c1398a.b);
                    } else if (c1398a.e != null) {
                        adaptiveImageView.setPlaceHolderRes(R.drawable.xm_sdk_chat_msg_img_loading);
                        adaptiveImageView.setErrorRes(R.drawable.xm_sdk_chat_msg_emotion_failed);
                        adaptiveImageView.setImageResource(com.sankuai.xm.integration.imageloader.utils.a.b(c1398a.e));
                    }
                    if (cVar2.a != null) {
                        cVar2.a.setVisibility(this.c.f ? 0 : 8);
                        cVar2.a.setText(c1398a.c);
                    }
                    cVar2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.xm.imui.common.panel.plugin.view.EmotionOptionView.a.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "318d6c28b490243a82872f3626c34b0c", 6917529027641081858L)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "318d6c28b490243a82872f3626c34b0c");
                                return;
                            }
                            EmotionOptionView.this.g.a(new com.sankuai.xm.imui.session.event.b(c1398a));
                            if (a.this.c.d == 1) {
                                EmotionOptionView.a(EmotionOptionView.this, a.this.e, c1398a, a.this.b);
                                InputEditorPlugin inputEditorPlugin = (InputEditorPlugin) com.sankuai.xm.imui.session.b.a(view, InputEditorPlugin.class);
                                if (inputEditorPlugin == null || inputEditorPlugin.getEditText() == null) {
                                    return;
                                }
                                EditText editText = inputEditorPlugin.getEditText();
                                if ("#_DEL_#".equals(c1398a.c)) {
                                    editText.dispatchKeyEvent(new KeyEvent(0, 67));
                                    return;
                                }
                                CharSequence a2 = f.b().a(EmotionOptionView.this.getContext()).a(c1398a.c);
                                int selectionStart = editText.getSelectionStart();
                                int selectionEnd = editText.getSelectionEnd();
                                editText.getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), a2, 0, a2.length());
                            } else if (a.this.c.d == 2) {
                                IMUIManager.a().a((IMMessage) com.sankuai.xm.imui.common.util.c.b(a.this.c.e, (String) a.this.c.g, c1398a.c), false);
                            } else if (a.this.c.d == 3) {
                                IMUIManager.a().a((IMMessage) com.sankuai.xm.imui.common.util.c.a(c1398a.d, a.this.c.h, a.this.c.i, c1398a.c, (String) a.this.c.g, c1398a.f), false);
                            }
                        }
                    });
                    cVar2.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.sankuai.xm.imui.common.panel.plugin.view.EmotionOptionView.a.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            int measuredWidth;
                            Object[] objArr3 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b6004a8d69a927e56468cfd187f38235", 6917529027641081856L)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b6004a8d69a927e56468cfd187f38235")).booleanValue();
                            }
                            if (a.this.c.d == 3 || a.this.c.d == 2) {
                                int[] iArr = new int[2];
                                cVar2.itemView.getLocationInWindow(iArr);
                                if (EmotionOptionView.this.f != null && EmotionOptionView.this.f.isShowing()) {
                                    p.b(EmotionOptionView.this.f);
                                }
                                EmotionOptionView.this.f = new PopupWindow(EmotionOptionView.this.getContext());
                                View inflate = EmotionOptionView.this.e.inflate(R.layout.xm_sdk_emotion_popup_panel, (ViewGroup) null);
                                EmotionOptionView.this.f.setContentView(inflate);
                                TextView textView2 = (TextView) inflate.findViewById(R.id.xm_sdk_image_name);
                                if (a.this.c.f && !TextUtils.isEmpty(c1398a.c)) {
                                    textView2.setText(c1398a.c);
                                    textView2.setVisibility(0);
                                } else {
                                    textView2.setVisibility(8);
                                }
                                final AdaptiveImageView adaptiveImageView2 = (AdaptiveImageView) inflate.findViewById(R.id.xm_sdk_image_view);
                                adaptiveImageView2.setErrorRes(R.drawable.xm_sdk_chat_msg_emotion_failed);
                                adaptiveImageView2.setPlaceHolderRes(R.drawable.xm_sdk_chat_msg_img_loading);
                                if (c1398a.b != 0 && c1398a.b != -1) {
                                    adaptiveImageView2.setImageResource(c1398a.b);
                                } else if (a.this.c.d == 3) {
                                    com.sankuai.xm.ui.service.b bVar = (com.sankuai.xm.ui.service.b) m.a(com.sankuai.xm.ui.service.b.class);
                                    if (bVar != null) {
                                        String a2 = bVar.a(a.this.c.h, c1398a.d, 4);
                                        if (com.sankuai.xm.base.util.k.o(a2)) {
                                            adaptiveImageView2.setImageResource(com.sankuai.xm.integration.imageloader.utils.a.a(a2));
                                        } else {
                                            bVar.a(a.this.c.h, c1398a.d, 4, a2, new com.sankuai.xm.im.f<b.a>() { // from class: com.sankuai.xm.imui.common.panel.plugin.view.EmotionOptionView.a.2.1
                                                public static ChangeQuickRedirect a;

                                                @Override // com.sankuai.xm.im.f
                                                public final /* synthetic */ void a(b.a aVar) {
                                                    b.a aVar2 = aVar;
                                                    Object[] objArr4 = {aVar2};
                                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "dc109b8544ffe2aa1d5e6ba023d73b0b", 6917529027641081856L)) {
                                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "dc109b8544ffe2aa1d5e6ba023d73b0b");
                                                    } else {
                                                        adaptiveImageView2.setImageResource(com.sankuai.xm.integration.imageloader.utils.a.a(aVar2.k));
                                                    }
                                                }

                                                @Override // com.sankuai.xm.im.f
                                                public final void a(int i3, String str) {
                                                    Object[] objArr4 = {Integer.valueOf(i3), str};
                                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1c4e66931c2fb4de508aac6e50e8366b", 6917529027641081856L)) {
                                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1c4e66931c2fb4de508aac6e50e8366b");
                                                    } else {
                                                        d.d("EmotionOptionView::fetchSticker:: code %s, msg: %s", Integer.valueOf(i3), str);
                                                    }
                                                }
                                            });
                                        }
                                    }
                                } else {
                                    adaptiveImageView2.setImageResource(R.drawable.xm_sdk_chat_msg_img_loading);
                                }
                                EmotionOptionView.this.f.setOutsideTouchable(true);
                                EmotionOptionView.this.f.setBackgroundDrawable(new ColorDrawable());
                                inflate.measure(0, 0);
                                if (i2 == 0) {
                                    measuredWidth = 0;
                                } else if (i2 == a.this.b - 1) {
                                    measuredWidth = cVar2.itemView.getMeasuredWidth() - inflate.getMeasuredWidth();
                                } else {
                                    measuredWidth = (cVar2.itemView.getMeasuredWidth() - inflate.getMeasuredWidth()) / 2;
                                }
                                int i3 = -(inflate.getMeasuredHeight() + k.a(EmotionOptionView.this.getContext(), 3.0f));
                                int i4 = iArr[0] + measuredWidth;
                                int i5 = iArr[1] + i3;
                                if (Build.VERSION.SDK_INT >= 24) {
                                    p.a(EmotionOptionView.this.f, cVar2.b, 0, i4, i5);
                                } else {
                                    p.a(EmotionOptionView.this.f, cVar2.itemView, measuredWidth, i3 - cVar2.itemView.getMeasuredHeight());
                                }
                                return true;
                            }
                            return false;
                        }
                    });
                    cVar2.itemView.setOnTouchListener(new View.OnTouchListener() { // from class: com.sankuai.xm.imui.common.panel.plugin.view.EmotionOptionView.a.3
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            Object[] objArr3 = {view, motionEvent};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "808e768cab742bc3cb9b52150b40927c", 6917529027641081856L)) {
                                return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "808e768cab742bc3cb9b52150b40927c")).booleanValue();
                            }
                            if ((motionEvent.getAction() == 3 || motionEvent.getAction() == 1) && EmotionOptionView.this.f != null && EmotionOptionView.this.f.isShowing()) {
                                p.b(EmotionOptionView.this.f);
                            }
                            return false;
                        }
                    });
                }
            }
        }

        @Override // android.support.v7.widget.RecyclerView.a
        @NonNull
        public final /* synthetic */ c onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            int i2;
            Object[] objArr = {viewGroup, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50d0cbf56420168edd03b890338120b5", 6917529027641081856L)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50d0cbf56420168edd03b890338120b5");
            }
            switch (i) {
                case 0:
                    i2 = R.layout.xm_sdk_send_panel_option_view_item_label;
                    break;
                case 1:
                    i2 = R.layout.xm_sdk_send_panel_option_view_item_small;
                    break;
                default:
                    i2 = R.layout.xm_sdk_send_panel_option_view_item_big;
                    break;
            }
            return new c(EmotionOptionView.this.e.inflate(i2, viewGroup, false), R.id.smiley_icon);
        }

        private a(com.sankuai.xm.imui.common.entity.a aVar, int i) {
            Object[] objArr = {EmotionOptionView.this, aVar, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "027f275ef401ca270cfeeef734f67c42", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "027f275ef401ca270cfeeef734f67c42");
                return;
            }
            this.c = aVar;
            this.b = i;
            this.d = EmotionOptionView.a(EmotionOptionView.this, aVar, this.b);
            this.e = EmotionOptionView.a(EmotionOptionView.this, aVar, this.b);
        }

        @NonNull
        public final int[] a(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "171b20dccdafc9ee1296dfa105e5dc6f", 6917529027641081856L)) {
                return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "171b20dccdafc9ee1296dfa105e5dc6f");
            }
            int b = com.sankuai.xm.base.util.b.b(this.d.m);
            if (b > 0) {
                if (i == 0) {
                    return new int[]{0, 0, this.b};
                }
                int i2 = b + 1;
                if (i < i2) {
                    int i3 = i - 1;
                    return new int[]{(i3 / this.b) + 1, i3 % this.b, 1};
                } else if (i == i2) {
                    return new int[]{2, 0, this.b};
                } else {
                    int i4 = (i - 2) - b;
                    return new int[]{(i4 / this.b) + 3, i4 % this.b, 1};
                }
            }
            return new int[]{i / this.b, i % this.b, 1};
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemViewType(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c04a5a92ad4e7ccced03f5d0ec92862e", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c04a5a92ad4e7ccced03f5d0ec92862e")).intValue();
            }
            int b = com.sankuai.xm.base.util.b.b(this.d.m);
            if (b <= 0 || !(i == 0 || i == b + 1)) {
                return this.c.d == 1 ? 1 : 2;
            }
            return 0;
        }

        @Override // android.support.v7.widget.RecyclerView.a
        public final int getItemCount() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c976a06e336e613d633a0b97ccdfaf1", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c976a06e336e613d633a0b97ccdfaf1")).intValue();
            }
            int b = com.sankuai.xm.base.util.b.b(this.c.m);
            int b2 = com.sankuai.xm.base.util.b.b(this.d.m);
            return b2 > 0 ? b + Math.min(this.b, b2) + 2 : b;
        }
    }

    private String a(com.sankuai.xm.imui.common.entity.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee8868fa21eac292f7963ffb69edd127", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee8868fa21eac292f7963ffb69edd127");
        }
        String str = "xm_sdk_emotion_recent_" + aVar.d + CommonConstant.Symbol.UNDERLINE;
        if (!TextUtils.isEmpty(aVar.e)) {
            return str + CommonConstant.Symbol.UNDERLINE + aVar.e;
        } else if (!TextUtils.isEmpty(aVar.h)) {
            return str + CommonConstant.Symbol.UNDERLINE + aVar.h;
        } else if (TextUtils.isEmpty(aVar.i)) {
            return str;
        } else {
            return str + CommonConstant.Symbol.UNDERLINE + aVar.i;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class c extends TabPagerView.a {
        public TextView a;

        public c(View view, int i) {
            super(view, R.id.smiley_icon);
            this.a = (TextView) view.findViewById(R.id.smiley_name);
        }
    }
}
