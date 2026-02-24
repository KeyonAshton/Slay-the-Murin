package gigimurin.cards.skills;

import com.megacrit.cardcrawl.characters.AbstractPlayer;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import com.megacrit.cardcrawl.powers.FocusPower;
import gigimurin.cards.AbstractEasyCard;

import static gigimurin.GigiMurinMain.makeID;
import static gigimurin.util.Wiz.applyToSelf;

public class BurntMarshmallow extends AbstractEasyCard {
    public final static String ID = makeID("BurntMarshmallow");
    // intellij stuff skill, self, basic, , , , , 1, 1

    public BurntMarshmallow() {
        super(ID, 1, CardType.SKILL, CardRarity.BASIC, CardTarget.SELF);
        this.magicNumber = this.baseMagicNumber = 1;
    }

    public void use(AbstractPlayer p, AbstractMonster m) {
        applyToSelf(new FocusPower(p, 1));
    }

    public void upp() {
    }
}