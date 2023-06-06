package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class AlertController {
    TextView A;
    TextView B;
    View C;
    ListAdapter D;
    int F;
    int G;
    int H;
    int I;
    int J;
    int K;
    boolean L;
    Handler N;
    final Context a;
    final AppCompatDialog b;
    final Window c;
    CharSequence d;
    CharSequence e;
    ListView f;
    View g;
    int h;
    int i;
    int j;
    int k;
    int l;
    Button n;
    CharSequence o;
    Message p;
    Button q;
    CharSequence r;
    Message s;
    Button t;
    CharSequence u;
    Message v;
    NestedScrollView w;
    Drawable y;
    ImageView z;
    boolean m = false;
    int x = 0;
    int E = -1;
    int M = 0;
    final View.OnClickListener O = new View.OnClickListener() { // from class: android.support.v7.app.AlertController.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message obtain;
            if (view == AlertController.this.n && AlertController.this.p != null) {
                obtain = Message.obtain(AlertController.this.p);
            } else if (view == AlertController.this.q && AlertController.this.s != null) {
                obtain = Message.obtain(AlertController.this.s);
            } else {
                obtain = (view != AlertController.this.t || AlertController.this.v == null) ? null : Message.obtain(AlertController.this.v);
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController.this.N.obtainMessage(1, AlertController.this.b).sendToTarget();
        }
    };

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class b extends Handler {
        private WeakReference<DialogInterface> a;

        public b(DialogInterface dialogInterface) {
            this.a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case -3:
                    case -2:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick(this.a.get(), message.what);
                        return;
                    default:
                        return;
                }
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }

    public AlertController(Context context, AppCompatDialog appCompatDialog, Window window) {
        this.a = context;
        this.b = appCompatDialog;
        this.c = window;
        this.N = new b(appCompatDialog);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16842994, R.attr.buttonPanelSideLayout, R.attr.listLayout, R.attr.multiChoiceItemLayout, R.attr.singleChoiceItemLayout, R.attr.listItemLayout, R.attr.showTitle}, R.attr.alertDialogStyle, 0);
        this.F = obtainStyledAttributes.getResourceId(0, 0);
        this.G = obtainStyledAttributes.getResourceId(1, 0);
        this.H = obtainStyledAttributes.getResourceId(2, 0);
        this.I = obtainStyledAttributes.getResourceId(3, 0);
        this.J = obtainStyledAttributes.getResourceId(4, 0);
        this.K = obtainStyledAttributes.getResourceId(5, 0);
        this.L = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.recycle();
        appCompatDialog.b(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void a(CharSequence charSequence) {
        this.d = charSequence;
        if (this.A != null) {
            this.A.setText(charSequence);
        }
    }

    public final void a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (onClickListener != null) {
            message = this.N.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.u = charSequence;
                this.v = message;
                return;
            case -2:
                this.r = charSequence;
                this.s = message;
                return;
            case -1:
                this.o = charSequence;
                this.p = message;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    public final void a(int i) {
        this.y = null;
        this.x = i;
        if (this.z != null) {
            if (i != 0) {
                this.z.setVisibility(0);
                this.z.setImageResource(this.x);
                return;
            }
            this.z.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static ViewGroup a(@Nullable View view, @Nullable View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    static void a(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {
        final int a;
        final int b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.paddingBottomNoButtons, R.attr.paddingTopNoTitle});
            this.b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public int A;
        public boolean[] C;
        public boolean D;
        public boolean E;
        public DialogInterface.OnMultiChoiceClickListener G;
        public Cursor H;
        public String I;
        public String J;
        public AdapterView.OnItemSelectedListener K;
        public final Context a;
        public final LayoutInflater b;
        public Drawable d;
        public CharSequence f;
        public View g;
        public CharSequence h;
        public CharSequence i;
        public DialogInterface.OnClickListener j;
        public CharSequence k;
        public DialogInterface.OnClickListener l;
        public CharSequence m;
        public DialogInterface.OnClickListener n;
        public DialogInterface.OnCancelListener p;
        public DialogInterface.OnDismissListener q;
        public DialogInterface.OnKeyListener r;
        public CharSequence[] s;
        public ListAdapter t;
        public DialogInterface.OnClickListener u;
        public int v;
        public View w;
        public int x;
        public int y;
        public int z;
        public int c = 0;
        public int e = 0;
        public boolean B = false;
        public int F = -1;
        public boolean L = true;
        public boolean o = true;

        public a(Context context) {
            this.a = context;
            this.b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class c extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }

        public c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, 16908308, charSequenceArr);
        }
    }
}
