package android.support.v7.widget;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.ResourceCursorAdapter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SuggestionsAdapter extends ResourceCursorAdapter implements View.OnClickListener {
    int a;
    private final SearchManager b;
    private final SearchView c;
    private final SearchableInfo d;
    private final Context e;
    private final WeakHashMap<String, Drawable.ConstantState> f;
    private final int g;
    private boolean h;
    private ColorStateList i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;

    @Override // android.support.v4.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public SuggestionsAdapter(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.h = false;
        this.a = 1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.b = (SearchManager) this.mContext.getSystemService("search");
        this.c = searchView;
        this.d = searchableInfo;
        this.g = searchView.getSuggestionCommitIconResId();
        this.e = context;
        this.f = weakHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[Catch: RuntimeException -> 0x0081, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0081, blocks: (B:10:0x001c, B:25:0x007d, B:13:0x0022, B:16:0x0029, B:18:0x004a, B:19:0x004d, B:21:0x0058, B:23:0x0064, B:22:0x0060), top: B:31:0x001c }] */
    @Override // android.support.v4.widget.CursorAdapter, android.support.v4.widget.CursorFilter.CursorFilterClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.database.Cursor runQueryOnBackgroundThread(java.lang.CharSequence r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L5
            java.lang.String r11 = ""
            goto L9
        L5:
            java.lang.String r11 = r11.toString()
        L9:
            android.support.v7.widget.SearchView r0 = r10.c
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L8a
            android.support.v7.widget.SearchView r0 = r10.c
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L1c
            goto L8a
        L1c:
            android.app.SearchableInfo r0 = r10.d     // Catch: java.lang.RuntimeException -> L81
            if (r0 != 0) goto L22
        L20:
            r11 = r1
            goto L7b
        L22:
            java.lang.String r2 = r0.getSuggestAuthority()     // Catch: java.lang.RuntimeException -> L81
            if (r2 != 0) goto L29
            goto L20
        L29:
            android.net.Uri$Builder r3 = new android.net.Uri$Builder     // Catch: java.lang.RuntimeException -> L81
            r3.<init>()     // Catch: java.lang.RuntimeException -> L81
            java.lang.String r4 = "content"
            android.net.Uri$Builder r3 = r3.scheme(r4)     // Catch: java.lang.RuntimeException -> L81
            android.net.Uri$Builder r2 = r3.authority(r2)     // Catch: java.lang.RuntimeException -> L81
            java.lang.String r3 = ""
            android.net.Uri$Builder r2 = r2.query(r3)     // Catch: java.lang.RuntimeException -> L81
            java.lang.String r3 = ""
            android.net.Uri$Builder r2 = r2.fragment(r3)     // Catch: java.lang.RuntimeException -> L81
            java.lang.String r3 = r0.getSuggestPath()     // Catch: java.lang.RuntimeException -> L81
            if (r3 == 0) goto L4d
            r2.appendEncodedPath(r3)     // Catch: java.lang.RuntimeException -> L81
        L4d:
            java.lang.String r3 = "search_suggest_query"
            r2.appendPath(r3)     // Catch: java.lang.RuntimeException -> L81
            java.lang.String r7 = r0.getSuggestSelection()     // Catch: java.lang.RuntimeException -> L81
            if (r7 == 0) goto L60
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.RuntimeException -> L81
            r3 = 0
            r0[r3] = r11     // Catch: java.lang.RuntimeException -> L81
            r8 = r0
            goto L64
        L60:
            r2.appendPath(r11)     // Catch: java.lang.RuntimeException -> L81
            r8 = r1
        L64:
            java.lang.String r11 = "limit"
            java.lang.String r0 = "50"
            r2.appendQueryParameter(r11, r0)     // Catch: java.lang.RuntimeException -> L81
            android.net.Uri r5 = r2.build()     // Catch: java.lang.RuntimeException -> L81
            android.content.Context r11 = r10.mContext     // Catch: java.lang.RuntimeException -> L81
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch: java.lang.RuntimeException -> L81
            r6 = 0
            r9 = 0
            android.database.Cursor r11 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.RuntimeException -> L81
        L7b:
            if (r11 == 0) goto L89
            r11.getCount()     // Catch: java.lang.RuntimeException -> L81
            return r11
        L81:
            r11 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r2 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r2, r11)
        L89:
            return r1
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SuggestionsAdapter.runQueryOnBackgroundThread(java.lang.CharSequence):android.database.Cursor");
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        a(getCursor());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        a(getCursor());
    }

    private static void a(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    @Override // android.support.v4.widget.CursorAdapter, android.support.v4.widget.CursorFilter.CursorFilterClient
    public void changeCursor(Cursor cursor) {
        if (this.h) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.changeCursor(cursor);
            if (cursor != null) {
                this.j = cursor.getColumnIndex("suggest_text_1");
                this.k = cursor.getColumnIndex("suggest_text_2");
                this.l = cursor.getColumnIndex("suggest_text_2_url");
                this.m = cursor.getColumnIndex("suggest_icon_1");
                this.n = cursor.getColumnIndex("suggest_icon_2");
                this.o = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // android.support.v4.widget.ResourceCursorAdapter, android.support.v4.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View newView = super.newView(context, cursor, viewGroup);
        newView.setTag(new a(newView));
        ((ImageView) newView.findViewById(R.id.edit_query)).setImageResource(this.g);
        return newView;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.a = (TextView) view.findViewById(16908308);
            this.b = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.d = (ImageView) view.findViewById(16908296);
            this.e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        Drawable a2;
        String str;
        a aVar = (a) view.getTag();
        int i = this.o != -1 ? cursor.getInt(this.o) : 0;
        if (aVar.a != null) {
            a(aVar.a, a(cursor, this.j));
        }
        if (aVar.b != null) {
            String a3 = a(cursor, this.l);
            if (a3 == null) {
                str = a(cursor, this.k);
            } else {
                if (this.i == null) {
                    TypedValue typedValue = new TypedValue();
                    this.mContext.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.i = this.mContext.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(a3);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.i, null), 0, a3.length(), 33);
                str = spannableString;
            }
            if (TextUtils.isEmpty(str)) {
                if (aVar.a != null) {
                    aVar.a.setSingleLine(false);
                    aVar.a.setMaxLines(2);
                }
            } else if (aVar.a != null) {
                aVar.a.setSingleLine(true);
                aVar.a.setMaxLines(1);
            }
            a(aVar.b, str);
        }
        if (aVar.c != null) {
            ImageView imageView = aVar.c;
            if (this.m == -1) {
                a2 = null;
            } else {
                a2 = a(cursor.getString(this.m));
                if (a2 == null) {
                    ComponentName searchActivity = this.d.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    if (this.f.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState = this.f.get(flattenToShortString);
                        a2 = constantState == null ? null : constantState.newDrawable(this.e.getResources());
                    } else {
                        a2 = a(searchActivity);
                        this.f.put(flattenToShortString, a2 == null ? null : a2.getConstantState());
                    }
                    if (a2 == null) {
                        a2 = this.mContext.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            a(imageView, a2, 4);
        }
        if (aVar.d != null) {
            a(aVar.d, this.n != -1 ? a(cursor.getString(this.n)) : null, 8);
        }
        if (this.a == 2 || (this.a == 1 && (i & 1) != 0)) {
            aVar.e.setVisibility(0);
            aVar.e.setTag(aVar.a.getText());
            aVar.e.setOnClickListener(this);
            return;
        }
        aVar.e.setVisibility(8);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.c.setQuery((CharSequence) tag);
        }
    }

    private static void a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private static void a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    @Override // android.support.v4.widget.CursorAdapter, android.support.v4.widget.CursorFilter.CursorFilterClient
    public CharSequence convertToString(Cursor cursor) {
        String a2;
        String a3;
        if (cursor == null) {
            return null;
        }
        String a4 = a(cursor, "suggest_intent_query");
        if (a4 != null) {
            return a4;
        }
        if (!this.d.shouldRewriteQueryFromData() || (a3 = a(cursor, "suggest_intent_data")) == null) {
            if (!this.d.shouldRewriteQueryFromText() || (a2 = a(cursor, "suggest_text_1")) == null) {
                return null;
            }
            return a2;
        }
        return a3;
    }

    @Override // android.support.v4.widget.CursorAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View newView = newView(this.mContext, this.mCursor, viewGroup);
            if (newView != null) {
                ((a) newView.getTag()).a.setText(e.toString());
            }
            return newView;
        }
    }

    @Override // android.support.v4.widget.CursorAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View newDropDownView = newDropDownView(this.mContext, this.mCursor, viewGroup);
            if (newDropDownView != null) {
                ((a) newDropDownView.getTag()).a.setText(e.toString());
            }
            return newDropDownView;
        }
    }

    private Drawable a(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.e.getPackageName() + "/" + parseInt;
            Drawable b = b(str2);
            if (b != null) {
                return b;
            }
            Drawable drawable = ContextCompat.getDrawable(this.e, parseInt);
            a(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            new StringBuilder("Icon resource not found: ").append(str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable b2 = b(str);
            if (b2 != null) {
                return b2;
            }
            Drawable a2 = a(Uri.parse(str));
            a(str, a2);
            return a2;
        }
    }

    private Drawable a(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return b(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream openInputStream = this.e.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
            try {
                openInputStream.close();
            } catch (IOException e) {
                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
            }
            return createFromStream;
        } catch (FileNotFoundException e2) {
            StringBuilder sb = new StringBuilder("Icon not found: ");
            sb.append(uri);
            sb.append(", ");
            sb.append(e2.getMessage());
            return null;
        }
        StringBuilder sb2 = new StringBuilder("Icon not found: ");
        sb2.append(uri);
        sb2.append(", ");
        sb2.append(e2.getMessage());
        return null;
    }

    private Drawable b(String str) {
        Drawable.ConstantState constantState = this.f.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private void a(String str, Drawable drawable) {
        if (drawable != null) {
            this.f.put(str, drawable.getConstantState());
        }
    }

    private Drawable a(ComponentName componentName) {
        PackageManager packageManager = this.mContext.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable == null) {
                StringBuilder sb = new StringBuilder("Invalid icon resource ");
                sb.append(iconResource);
                sb.append(" for ");
                sb.append(componentName.flattenToShortString());
                return null;
            }
            return drawable;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String a(Cursor cursor, String str) {
        return a(cursor, cursor.getColumnIndex(str));
    }

    private static String a(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    private Drawable b(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.mContext.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size == 2) {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            } else {
                throw new FileNotFoundException("More than two path segments: " + uri);
            }
            if (parseInt == 0) {
                throw new FileNotFoundException("No resource found for: " + uri);
            }
            return resourcesForApplication.getDrawable(parseInt);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }
}
