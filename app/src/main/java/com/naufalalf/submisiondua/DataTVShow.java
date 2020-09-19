package com.naufalalf.submisiondua;

import java.util.ArrayList;

public class DataTVShow {
    public static String[][] datatv = new String[][]{
            {"Titans","https://image.tmdb.org/t/p/w185_and_h278_bestv2/eeHI5iBSCOxj4HGSOmFM6azBmwb.jpg", "78%","October 12, 2018", "A team of young superheroes led by Nightwing (formerly Batman's first Robin) form to combat evil and other perils." },
            {"9-1-1","https://image.tmdb.org/t/p/w185_and_h278_bestv2/htX1x0gq8Y5bN9vtGzERf9nbOTK.jpg","75%","January 3, 2018","Explore the high-pressure experiences of police officers, paramedics and firefighters who are thrust into the most frightening, shocking and heart-stopping situations. These emergency responders must try to balance"},
            {"Black Lightning","https://image.tmdb.org/t/p/w185_and_h278_bestv2/90QFKG1QK7szgMIB2SxFADY1pvy.jpg", "65%","January 16, 2018", "Jefferson Pierce is a man wrestling with a secret. As the father of two daughters and principal of a charter high school that also serves as a safe haven for young people in a New Orleans neighborhood overrun "},
            {"Super Dragon Ball Heroes","https://image.tmdb.org/t/p/w185_and_h278_bestv2/79C1S70I2nR4o0WpVETIezT3jyG.jpg","73%","July 1, 2018", "Trunks returns from the future to train with Goku and Vegeta. However, it disappears without warning. Then the mysterious Fu bursts in, telling them that Trunks has been imprisoned in the Prison Planet, a mysterious"},
            {"Captain Tsubasa","https://image.tmdb.org/t/p/w185_and_h278_bestv2/zHgc9nTXiP77qoy14BO7WUFTwkp.jpg","68%","April 3, 2018","The passionate story of an elementary school student whose thoughts and dreams revolve almost entirely around the love of soccer. 11-year-old Tsubasa Oozora started playing football at a very young age, and while"},
            {"Lost in Space","https://image.tmdb.org/t/p/w185_and_h278_bestv2/83mK4CnvRPFSqcyO3s3lq6aDy1x.jpg","68%","April 13, 2018","After crash-landing on an alien planet, the Robinson family fights against all odds to survive and escape. But they're surrounded by hidden dangers."},
            {"Siren","https://image.tmdb.org/t/p/w185_and_h278_bestv2/jYwhgaPwDbgC1MneMsAZTkcPcLJ.jpg","78%","March 29, 2018","The coastal town of Bristol Cove is known for its legend of once being home to mermaids. When the arrival of a mysterious girl proves this folklore all too true, the battle between man and sea takes a very vicious"},
            {"Sex Education","https://image.tmdb.org/t/p/w185_and_h278_bestv2/4Bph0hhnDH6dpc0SZIV522bLm4P.jpg","80%","January 11, 2019","Inexperienced Otis channels his sex therapist mom when he teams up with rebellious Maeve to set up an underground sex therapy clinic at school."},
            {"The Witcher","https://image.tmdb.org/t/p/w185_and_h278_bestv2/zrPpUlehQaBf8YX2NrVrKK8IEpf.jpg","81%","December 20, 2019","Geralt of Rivia, a mutated monster-hunter for hire, journeys toward his destiny in a turbulent world where people often prove more wicked than beasts."},
            {"Bat Woman","https://image.tmdb.org/t/p/w185_and_h278_bestv2/jnaimWkIVSD9IInmZPyLYarSvvc.jpg","66%","October 6, 2019","Kate Kane, armed with a passion for social justice and a flair for speaking her mind, soars onto the streets of Gotham as Batwoman, an out lesbian and highly trained street fighter primed to snuff out the failing"},
            {"Doom Patrol","https://image.tmdb.org/t/p/w185_and_h278_bestv2/nVN7Dt0Xr78gnJepRsRLaLYklbY.jpg","65%","February 15, 2019","The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief,"},
            {"Harley Quinn","https://image.tmdb.org/t/p/w185_and_h278_bestv2/2qZwqQzm9GfxamposgXrX7dLKcF.jpg","83%","November 29, 2019","Harley Quinn has finally broken things off once and for all with the Joker and attempts to make it on her own as the criminal Queenpin of Gotham City."}
    };
    public static ArrayList<TVModel> getData() {
        ArrayList<TVModel> tvshowArrayList = new ArrayList<>();
        for (String[] aData : datatv) {
            TVModel tvshow = new TVModel();
            tvshow.setJudultv(aData[0]);
            tvshow.setGambartv(aData[1]);
            tvshow.setRatingtv(aData[2]);
            tvshow.setRilistv(aData[3]);
            tvshow.setSinopsistv(aData[4]);
            tvshowArrayList.add(tvshow);
        }
        return tvshowArrayList;

    }
}
