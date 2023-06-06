package android.support.v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.constraint.R;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.CursorAdapter;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.robust.common.CommonConstant;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements android.support.v7.view.c {
    static final a p = new a();
    private final int A;
    private final int B;
    private final CharSequence C;
    private c D;
    private b E;
    private View.OnClickListener F;
    private boolean G;
    private boolean H;
    private CharSequence I;
    private boolean J;
    private boolean K;
    private int L;
    private boolean M;
    private CharSequence N;
    private CharSequence O;
    private boolean P;
    private int Q;
    private final Runnable R;
    private Runnable S;
    private final WeakHashMap<String, Drawable.ConstantState> T;
    private final View.OnClickListener U;
    private final TextView.OnEditorActionListener V;
    private final AdapterView.OnItemClickListener W;
    final SearchAutoComplete a;
    private final AdapterView.OnItemSelectedListener aa;
    private TextWatcher ab;
    final View b;
    final ImageView c;
    final ImageView d;
    final ImageView e;
    final ImageView f;
    final View g;
    final Intent h;
    final Intent i;
    View.OnFocusChangeListener j;
    d k;
    boolean l;
    CursorAdapter m;
    SearchableInfo n;
    Bundle o;
    View.OnKeyListener q;
    private final View r;
    private final View s;
    private e t;
    private Rect u;
    private Rect v;
    private int[] w;
    private int[] x;
    private final ImageView y;
    private final Drawable z;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        boolean a();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface c {
        boolean a(String str);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface d {
        boolean a(int i);

        boolean b(int i);
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private SearchView(Context context, AttributeSet attributeSet) {
        this(context, null, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = new Rect();
        this.v = new Rect();
        this.w = new int[2];
        this.x = new int[2];
        this.R = new Runnable() { // from class: android.support.v7.widget.SearchView.1
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.this.d();
            }
        };
        this.S = new Runnable() { // from class: android.support.v7.widget.SearchView.3
            @Override // java.lang.Runnable
            public final void run() {
                if (SearchView.this.m == null || !(SearchView.this.m instanceof SuggestionsAdapter)) {
                    return;
                }
                SearchView.this.m.changeCursor(null);
            }
        };
        this.T = new WeakHashMap<>();
        this.U = new View.OnClickListener() { // from class: android.support.v7.widget.SearchView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (view == SearchView.this.c) {
                    SearchView.this.g();
                } else if (view == SearchView.this.e) {
                    SearchView.this.f();
                } else if (view == SearchView.this.d) {
                    SearchView.this.e();
                } else if (view == SearchView.this.f) {
                    SearchView searchView = SearchView.this;
                    if (searchView.n != null) {
                        SearchableInfo searchableInfo = searchView.n;
                        try {
                            String str = null;
                            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                                    Intent intent = searchView.i;
                                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                                    Intent intent2 = new Intent("android.intent.action.SEARCH");
                                    intent2.setComponent(searchActivity);
                                    PendingIntent activity = PendingIntent.getActivity(searchView.getContext(), 0, intent2, 1073741824);
                                    Bundle bundle = new Bundle();
                                    if (searchView.o != null) {
                                        bundle.putParcelable("app_data", searchView.o);
                                    }
                                    Intent intent3 = new Intent(intent);
                                    Resources resources = searchView.getResources();
                                    String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
                                    String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
                                    String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
                                    int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
                                    intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
                                    intent3.putExtra("android.speech.extra.PROMPT", string2);
                                    intent3.putExtra("android.speech.extra.LANGUAGE", string3);
                                    intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
                                    if (searchActivity != null) {
                                        str = searchActivity.flattenToShortString();
                                    }
                                    intent3.putExtra("calling_package", str);
                                    intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                                    intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                                    searchView.getContext().startActivity(intent3);
                                    return;
                                }
                                return;
                            }
                            Intent intent4 = new Intent(searchView.h);
                            ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                            if (searchActivity2 != null) {
                                str = searchActivity2.flattenToShortString();
                            }
                            intent4.putExtra("calling_package", str);
                            searchView.getContext().startActivity(intent4);
                        } catch (ActivityNotFoundException unused) {
                        }
                    }
                } else if (view == SearchView.this.a) {
                    SearchView.this.i();
                }
            }
        };
        this.q = new View.OnKeyListener() { // from class: android.support.v7.widget.SearchView.7
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (SearchView.this.n == null) {
                    return false;
                }
                if (SearchView.this.a.isPopupShowing() && SearchView.this.a.getListSelection() != -1) {
                    return SearchView.this.a(view, i2, keyEvent);
                }
                if (!SearchAutoComplete.a(SearchView.this.a) && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i2 == 66) {
                    view.cancelLongPress();
                    SearchView.this.a(0, (String) null, SearchView.this.a.getText().toString());
                    return true;
                }
                return false;
            }
        };
        this.V = new TextView.OnEditorActionListener() { // from class: android.support.v7.widget.SearchView.8
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                SearchView.this.e();
                return true;
            }
        };
        this.W = new AdapterView.OnItemClickListener() { // from class: android.support.v7.widget.SearchView.9
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                SearchView.this.a(i2, 0, (String) null);
            }
        };
        this.aa = new AdapterView.OnItemSelectedListener() { // from class: android.support.v7.widget.SearchView.10
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                SearchView searchView = SearchView.this;
                if (searchView.k == null || !searchView.k.a(i2)) {
                    Editable text = searchView.a.getText();
                    Cursor cursor = searchView.m.getCursor();
                    if (cursor != null) {
                        if (cursor.moveToPosition(i2)) {
                            CharSequence convertToString = searchView.m.convertToString(cursor);
                            if (convertToString != null) {
                                searchView.setQuery(convertToString);
                                return;
                            } else {
                                searchView.setQuery(text);
                                return;
                            }
                        }
                        searchView.setQuery(text);
                    }
                }
            }
        };
        this.ab = new TextWatcher() { // from class: android.support.v7.widget.SearchView.2
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                SearchView.this.a(charSequence);
            }
        };
        aw a2 = aw.a(context, attributeSet, new int[]{16842970, 16843039, 16843296, 16843364, R.attr.layout, R.attr.iconifiedByDefault, R.attr.queryHint, R.attr.defaultQueryHint, R.attr.closeIcon, R.attr.goIcon, R.attr.searchIcon, R.attr.searchHintIcon, R.attr.voiceIcon, R.attr.commitIcon, R.attr.suggestionRowLayout, R.attr.queryBackground, R.attr.submitBackground}, i, 0);
        LayoutInflater.from(context).inflate(a2.g(4, R.layout.abc_search_view), (ViewGroup) this, true);
        this.a = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.a.setSearchView(this);
        this.r = findViewById(R.id.search_edit_frame);
        this.b = findViewById(R.id.search_plate);
        this.s = findViewById(R.id.submit_area);
        this.c = (ImageView) findViewById(R.id.search_button);
        this.d = (ImageView) findViewById(R.id.search_go_btn);
        this.e = (ImageView) findViewById(R.id.search_close_btn);
        this.f = (ImageView) findViewById(R.id.search_voice_btn);
        this.y = (ImageView) findViewById(R.id.search_mag_icon);
        ViewCompat.setBackground(this.b, a2.a(15));
        ViewCompat.setBackground(this.s, a2.a(16));
        this.c.setImageDrawable(a2.a(10));
        this.d.setImageDrawable(a2.a(9));
        this.e.setImageDrawable(a2.a(8));
        this.f.setImageDrawable(a2.a(12));
        this.y.setImageDrawable(a2.a(10));
        this.z = a2.a(11);
        ay.a(this.c, getResources().getString(R.string.abc_searchview_description_search));
        this.A = a2.g(14, R.layout.abc_search_dropdown_item_icons_2line);
        this.B = a2.g(13, 0);
        this.c.setOnClickListener(this.U);
        this.e.setOnClickListener(this.U);
        this.d.setOnClickListener(this.U);
        this.f.setOnClickListener(this.U);
        this.a.setOnClickListener(this.U);
        this.a.addTextChangedListener(this.ab);
        this.a.setOnEditorActionListener(this.V);
        this.a.setOnItemClickListener(this.W);
        this.a.setOnItemSelectedListener(this.aa);
        this.a.setOnKeyListener(this.q);
        this.a.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: android.support.v7.widget.SearchView.4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (SearchView.this.j != null) {
                    SearchView.this.j.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(a2.a(5, true));
        int e2 = a2.e(1, -1);
        if (e2 != -1) {
            setMaxWidth(e2);
        }
        this.C = a2.c(7);
        this.I = a2.c(6);
        int a3 = a2.a(3, -1);
        if (a3 != -1) {
            setImeOptions(a3);
        }
        int a4 = a2.a(2, -1);
        if (a4 != -1) {
            setInputType(a4);
        }
        setFocusable(a2.a(0, true));
        a2.a.recycle();
        this.h = new Intent("android.speech.action.WEB_SEARCH");
        this.h.addFlags(com.tencent.mapsdk.internal.y.a);
        this.h.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.i = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.i.addFlags(com.tencent.mapsdk.internal.y.a);
        this.g = findViewById(this.a.getDropDownAnchor());
        if (this.g != null) {
            this.g.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: android.support.v7.widget.SearchView.5
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    int i10;
                    SearchView searchView = SearchView.this;
                    if (searchView.g.getWidth() > 1) {
                        Resources resources = searchView.getContext().getResources();
                        int paddingLeft = searchView.b.getPaddingLeft();
                        Rect rect = new Rect();
                        boolean a5 = bd.a(searchView);
                        int dimensionPixelSize = searchView.l ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
                        searchView.a.getDropDownBackground().getPadding(rect);
                        if (a5) {
                            i10 = -rect.left;
                        } else {
                            i10 = paddingLeft - (rect.left + dimensionPixelSize);
                        }
                        searchView.a.setDropDownHorizontalOffset(i10);
                        searchView.a.setDropDownWidth((((searchView.g.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    }
                }
            });
        }
        a(this.l);
        n();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.B;
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.n = searchableInfo;
        Intent intent = null;
        if (this.n != null) {
            this.a.setThreshold(this.n.getSuggestThreshold());
            this.a.setImeOptions(this.n.getImeOptions());
            int inputType = this.n.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.n.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            this.a.setInputType(inputType);
            if (this.m != null) {
                this.m.changeCursor(null);
            }
            if (this.n.getSuggestAuthority() != null) {
                this.m = new SuggestionsAdapter(getContext(), this, this.n, this.T);
                this.a.setAdapter(this.m);
                ((SuggestionsAdapter) this.m).a = this.J ? 2 : 1;
            }
            n();
        }
        boolean z = false;
        if (this.n != null && this.n.getVoiceSearchEnabled()) {
            if (this.n.getVoiceSearchLaunchWebSearch()) {
                intent = this.h;
            } else if (this.n.getVoiceSearchLaunchRecognizer()) {
                intent = this.i;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                z = true;
            }
        }
        this.M = z;
        if (this.M) {
            this.a.setPrivateImeOptions("nm");
        }
        a(this.G);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setAppSearchData(Bundle bundle) {
        this.o = bundle;
    }

    public void setImeOptions(int i) {
        this.a.setImeOptions(i);
    }

    public int getImeOptions() {
        return this.a.getImeOptions();
    }

    public void setInputType(int i) {
        this.a.setInputType(i);
    }

    public int getInputType() {
        return this.a.getInputType();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (!this.K && isFocusable()) {
            if (!this.G) {
                boolean requestFocus = this.a.requestFocus(i, rect);
                if (requestFocus) {
                    a(false);
                }
                return requestFocus;
            }
            return super.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.K = true;
        super.clearFocus();
        this.a.clearFocus();
        this.a.setImeVisibility(false);
        this.K = false;
    }

    public void setOnQueryTextListener(c cVar) {
        this.D = cVar;
    }

    public void setOnCloseListener(b bVar) {
        this.E = bVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.j = onFocusChangeListener;
    }

    public void setOnSuggestionListener(d dVar) {
        this.k = dVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.F = onClickListener;
    }

    public CharSequence getQuery() {
        return this.a.getText();
    }

    public void setQueryHint(@Nullable CharSequence charSequence) {
        this.I = charSequence;
        n();
    }

    @Nullable
    public CharSequence getQueryHint() {
        if (this.I != null) {
            return this.I;
        }
        if (this.n != null && this.n.getHintId() != 0) {
            return getContext().getText(this.n.getHintId());
        }
        return this.C;
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.l == z) {
            return;
        }
        this.l = z;
        a(z);
        n();
    }

    public void setIconified(boolean z) {
        if (z) {
            f();
        } else {
            g();
        }
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.H = z;
        a(this.G);
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.J = z;
        if (this.m instanceof SuggestionsAdapter) {
            ((SuggestionsAdapter) this.m).a = z ? 2 : 1;
        }
    }

    public void setSuggestionsAdapter(CursorAdapter cursorAdapter) {
        this.m = cursorAdapter;
        this.a.setAdapter(this.m);
    }

    public CursorAdapter getSuggestionsAdapter() {
        return this.m;
    }

    public void setMaxWidth(int i) {
        this.L = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.a;
            Rect rect = this.u;
            searchAutoComplete.getLocationInWindow(this.w);
            getLocationInWindow(this.x);
            int i5 = this.w[1] - this.x[1];
            int i6 = this.w[0] - this.x[0];
            rect.set(i6, i5, searchAutoComplete.getWidth() + i6, searchAutoComplete.getHeight() + i5);
            this.v.set(this.u.left, 0, this.u.right, i4 - i2);
            if (this.t == null) {
                this.t = new e(this.v, this.u, this.a);
                setTouchDelegate(this.t);
                return;
            }
            this.t.a(this.v, this.u);
        }
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private void a(boolean z) {
        this.G = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.a.getText());
        this.c.setVisibility(i2);
        b(z2);
        this.r.setVisibility(z ? 8 : 0);
        if (this.y.getDrawable() != null && !this.l) {
            i = 0;
        }
        this.y.setVisibility(i);
        l();
        c(z2 ? false : true);
        k();
    }

    private boolean j() {
        return (this.H || this.M) && !this.G;
    }

    private void b(boolean z) {
        this.d.setVisibility((this.H && j() && hasFocus() && (z || !this.M)) ? 0 : 8);
    }

    private void k() {
        this.s.setVisibility((j() && (this.d.getVisibility() == 0 || this.f.getVisibility() == 0)) ? 0 : 8);
    }

    private void l() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.a.getText());
        if (!z2 && (!this.l || this.P)) {
            z = false;
        }
        this.e.setVisibility(z ? 0 : 8);
        Drawable drawable = this.e.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    private void m() {
        post(this.R);
    }

    final void d() {
        int[] iArr = this.a.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.b.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.R);
        post(this.S);
        super.onDetachedFromWindow();
    }

    final boolean a(View view, int i, KeyEvent keyEvent) {
        if (this.n != null && this.m != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return a(this.a.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                this.a.setSelection(i == 21 ? 0 : this.a.length());
                this.a.setListSelection(0);
                this.a.clearListSelection();
                p.a(this.a, true);
                return true;
            } else if (i != 19 || this.a.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    private CharSequence b(CharSequence charSequence) {
        if (!this.l || this.z == null) {
            return charSequence;
        }
        int textSize = (int) (this.a.getTextSize() * 1.25d);
        this.z.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.z), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void n() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(b(queryHint));
    }

    private void c(boolean z) {
        int i;
        if (this.M && !this.G && z) {
            i = 0;
            this.d.setVisibility(8);
        } else {
            i = 8;
        }
        this.f.setVisibility(i);
    }

    final void a(CharSequence charSequence) {
        Editable text = this.a.getText();
        this.O = text;
        boolean z = !TextUtils.isEmpty(text);
        b(z);
        c(z ? false : true);
        l();
        k();
        if (this.D != null && !TextUtils.equals(charSequence, this.N)) {
            charSequence.toString();
        }
        this.N = charSequence.toString();
    }

    final void e() {
        Editable text = this.a.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.D == null || !this.D.a(text.toString())) {
            if (this.n != null) {
                a(0, (String) null, text.toString());
            }
            this.a.setImeVisibility(false);
            this.a.dismissDropDown();
        }
    }

    final void f() {
        if (TextUtils.isEmpty(this.a.getText())) {
            if (this.l) {
                if (this.E == null || !this.E.a()) {
                    clearFocus();
                    a(true);
                    return;
                }
                return;
            }
            return;
        }
        this.a.setText("");
        this.a.requestFocus();
        this.a.setImeVisibility(true);
    }

    final void g() {
        a(false);
        this.a.requestFocus();
        this.a.setImeVisibility(true);
        if (this.F != null) {
            this.F.onClick(this);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m();
    }

    @Override // android.support.v7.view.c
    public final void a() {
        if (this.P) {
            return;
        }
        this.P = true;
        this.Q = this.a.getImeOptions();
        this.a.setImeOptions(this.Q | 33554432);
        this.a.setText("");
        setIconified(false);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: android.support.v7.widget.SearchView.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };
        boolean a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        @Override // android.support.v4.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.a));
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.a + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.G;
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        a(savedState.a);
        requestLayout();
    }

    final boolean a(int i, int i2, String str) {
        if (this.k == null || !this.k.b(i)) {
            b(i, 0, null);
            this.a.setImeVisibility(false);
            this.a.dismissDropDown();
            return true;
        }
        return false;
    }

    private boolean b(int i, int i2, String str) {
        Cursor cursor = this.m.getCursor();
        if (cursor == null || !cursor.moveToPosition(i)) {
            return false;
        }
        a(a(cursor, 0, (String) null));
        return true;
    }

    private void a(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e2) {
            Log.e("SearchView", "Failed launch activity: " + intent, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setQuery(CharSequence charSequence) {
        this.a.setText(charSequence);
        this.a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    final void a(int i, String str, String str2) {
        getContext().startActivity(a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, 0, (String) null));
    }

    private Intent a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(com.tencent.mapsdk.internal.y.a);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.O);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.o != null) {
            intent.putExtra("app_data", this.o);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.n.getSearchActivity());
        return intent;
    }

    private Intent a(Cursor cursor, int i, String str) {
        int i2;
        String a2;
        try {
            String a3 = SuggestionsAdapter.a(cursor, "suggest_intent_action");
            if (a3 == null) {
                a3 = this.n.getSuggestIntentAction();
            }
            if (a3 == null) {
                a3 = "android.intent.action.SEARCH";
            }
            String str2 = a3;
            String a4 = SuggestionsAdapter.a(cursor, "suggest_intent_data");
            if (a4 == null) {
                a4 = this.n.getSuggestIntentData();
            }
            if (a4 != null && (a2 = SuggestionsAdapter.a(cursor, "suggest_intent_data_id")) != null) {
                a4 = a4 + "/" + Uri.encode(a2);
            }
            return a(str2, a4 == null ? null : Uri.parse(a4), SuggestionsAdapter.a(cursor, "suggest_intent_extra_data"), SuggestionsAdapter.a(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e2) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e2);
            return null;
        }
    }

    final void i() {
        p.a(this.a);
        p.b(this.a);
    }

    static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class e extends TouchDelegate {
        private final View a;
        private final Rect b;
        private final Rect c;
        private final Rect d;
        private final int e;
        private boolean f;

        public e(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.d = new Rect();
            this.c = new Rect();
            a(rect, rect2);
            this.a = view;
        }

        public final void a(Rect rect, Rect rect2) {
            this.b.set(rect);
            this.d.set(rect);
            this.d.inset(-this.e, -this.e);
            this.c.set(rect2);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            boolean z2 = true;
            switch (motionEvent.getAction()) {
                case 0:
                    if (this.b.contains(x, y)) {
                        this.f = true;
                        z = true;
                        break;
                    }
                    z = false;
                    break;
                case 1:
                case 2:
                    z = this.f;
                    if (z && !this.d.contains(x, y)) {
                        z2 = false;
                        break;
                    }
                    break;
                case 3:
                    z = this.f;
                    this.f = false;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                if (z2 && !this.c.contains(x, y)) {
                    motionEvent.setLocation(this.a.getWidth() / 2, this.a.getHeight() / 2);
                } else {
                    motionEvent.setLocation(x - this.c.left, y - this.c.top);
                }
                return this.a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* compiled from: ProGuard */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        final Runnable a;
        private int b;
        private SearchView c;
        private boolean d;

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.a = new Runnable() { // from class: android.support.v7.widget.SearchView.SearchAutoComplete.1
                @Override // java.lang.Runnable
                public final void run() {
                    SearchAutoComplete.b(SearchAutoComplete.this);
                }
            };
            this.b = getThreshold();
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        void setSearchView(SearchView searchView) {
            this.c = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.b = i;
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.c.hasFocus() && getVisibility() == 0) {
                this.d = true;
                if (SearchView.a(getContext())) {
                    SearchView.p.a(this, true);
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.c.h();
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.b <= 0 || super.enoughToFilter();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.c.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i < 960 || i2 < 720 || configuration.orientation != 2) {
                if (i < 600) {
                    return (i < 640 || i2 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        @Override // android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.d) {
                removeCallbacks(this.a);
                post(this.a);
            }
            return onCreateInputConnection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.d = false;
                removeCallbacks(this.a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.d = false;
                removeCallbacks(this.a);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.d = true;
            }
        }

        static /* synthetic */ boolean a(SearchAutoComplete searchAutoComplete) {
            return TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0;
        }

        static /* synthetic */ void b(SearchAutoComplete searchAutoComplete) {
            if (searchAutoComplete.d) {
                ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                searchAutoComplete.d = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        private Method a;
        private Method b;
        private Method c;

        a() {
            try {
                this.a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                this.b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                this.c = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        final void a(AutoCompleteTextView autoCompleteTextView) {
            if (this.a != null) {
                try {
                    this.a.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        final void b(AutoCompleteTextView autoCompleteTextView) {
            if (this.b != null) {
                try {
                    this.b.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        final void a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            if (this.c != null) {
                try {
                    this.c.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.G) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            size = this.L > 0 ? Math.min(this.L, size) : Math.min(getPreferredWidth(), size);
        } else if (mode != 0) {
            if (mode == 1073741824 && this.L > 0) {
                size = Math.min(this.L, size);
            }
        } else {
            size = this.L > 0 ? this.L : getPreferredWidth();
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    final void h() {
        a(this.G);
        m();
        if (this.a.hasFocus()) {
            i();
        }
    }

    @Override // android.support.v7.view.c
    public final void b() {
        this.a.setText("");
        this.a.setSelection(this.a.length());
        this.O = "";
        clearFocus();
        a(true);
        this.a.setImeOptions(this.Q);
        this.P = false;
    }
}
