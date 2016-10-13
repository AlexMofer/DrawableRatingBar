package am.example.drawableratingbar;

import android.os.Bundle;


public class DrawableRatingBarActivity extends BaseActivity {

    @Override
    protected int getContentViewLayoutResources() {
        return R.layout.activity_drawableratingbar;
    }

    @Override
    protected void initResource(Bundle savedInstanceState) {
        setSupportActionBar(R.id.drb_toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }
}