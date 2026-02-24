package gigimurin.grems;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.megacrit.cardcrawl.orbs.AbstractOrb;

public abstract class EasyOrb extends AbstractOrb {

    public int mergeCount = 0;
    public boolean mergeable = false;

    @Override
    public void updateDescription() {

    }

    @Override
    public void onEvoke() {

    }

    @Override
    public com.megacrit.cardcrawl.orbs.AbstractOrb makeCopy() {
        return null;
    }

    @Override
    public void render(SpriteBatch spriteBatch) {

    }

    @Override
    public void playChannelSFX() {

    }
}
