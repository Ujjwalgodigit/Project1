package com.digit.packageProject1;

import java.util.Scanner;
class Products
{
    void ProductsM()
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("<-------------Welcome to Main Menuu------------->\n"
                + "Select one of these products to buy\n"
                +"\n"
                + "1.(Electronics)  --->\n"
                +"\n"
                + "2.(Fashion)      --->\n"
                +"\n"
                + "3.(Appliances)   --->\n"
                +"\n"
                + "4.(Furniture)    --->\n"
                );
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                Electronics ElectronicsObj = new Electronics();
                ElectronicsObj.ElectronicsMethod();       // calling method
                break;
            case 2:
                Fashion FashionObj = new Fashion();
                FashionObj.FashionMethod();               // calling method
                break;
            case 3:
                Appliances AppliancesObj = new Appliances();
                AppliancesObj.AppliancesMethod();         // calling method
                break;
            default :
                Furniture FurnitureObj = new Furniture();
                FurnitureObj.FurnitureMethod();              // calling method
                break;

        }
    }

}
class Electronics extends Products
{
    void ElectronicsMethod() {
        Scanner sc = new Scanner(System.in);
        int sc1;
        Phone PhoneObj = new Phone();        
        Laptop LaptopObj = new Laptop();
        Smart_watches Smart_watchesObj = new Smart_watches();
        Speakers SpeakersObj = new Speakers();  
        System.out.println("Welcome to Electronics portal\n"
                + "Select one of these products to buy\n"
                +"\n"
                + "1.Phone\n"
                +"\n"
                + "2.Laptop\n"
                +"\n"
                + "3.Smart watches\n"
                +"\n"
                + "4.Speakers\n");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                PhoneObj.PhoneM(); // calling AppleM by s1
                break;
                case 2:
                LaptopObj.LaptopM(); // calling AppleM by s1
                break;
                case 3:
                Smart_watchesObj.Smart_watchesM(); // calling AppleM by s1
                break;
            case 4:
                SpeakersObj.SpeakersM();
                break;
        }

    }
}
class Phone extends Electronics
{
  void PhoneM()
  {
     Scanner sc = new Scanner(System.in);
        int sc1;
        iphone14 s1 = new iphone14();
        Mi s2 = new Mi();
       // Samsung s2 = new Samsung(); // creating object
        System.out.println("Welcome to my Phone portal\n"
                + "Select one of these Brands products to buy\n"
                + "1.iphoneXR\n"
                +"\n"
                + "2.Mi");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                s1.iphone14M(); // calling AppleM by s1
                break;
            default:
                s2.MiM();
                break;
        }
  }
}
class iphone14 extends Phone {
    void iphone14M()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    iphoneXR   \n"
                                +"Here specifications of iphoneXR\n"
                                +"\n"
                                +"LAUNCH Announced ---->2018, September 12\n"
                                +"\n"
                                +"Weight           ---->194g\n"
                                +"\n"
                                +"Resolution       ---->828 x 1792 pixels(~326 ppi density)\n"
                                +"\n"
                                +"OS               ---->iOS 12\n"
                                +"\n"
                                +"Camera           ---->12 MP, f/1.8, 26mm (wide)\n" //
                                +"\n"
                                +"Features         ---->Quad-LED dual-tone flash, HDR (photo/panorama)\n"
                                +"\n"
                                +"Video            ---->4K@24/30/60fps, 1080p@30/60/120/240fps, HDR, stereo sound rec");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order iphone XR is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       PhoneM();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                 PhoneM();
                               }
                 //creating object

    }
}
class Mi extends Phone {
    void MiM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    Mi 12 pro   \n"
                                +"Here specifications of Mi 12 Pro\n"
                                +"\n"
                                +"LAUNCH Announced ---->2021, may 15\n"
                                +"\n"
                                +"Weight           ---->162g\n"
                                +"\n"
                                +"Resolution       ---->1920 x 1080 pixels(~441 ppi density)\n"
                                +"\n"
                                +"OS               ---->MiUi 14\n"
                                +"\n"
                                +"Camera           ---->108 MP, f/1.8, 26mm (wide)\n" //
                                +"\n"
                                +"Features         ---->Quad-LED dual-tone flash, HDR , Night Mode (photo/panorama)\n"
                                +"\n"
                                +"Video            ---->4K@24/30/60fps, 1080p@30/60/120/240fps, HDR, stereo sound rec");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order 'Mi 12 Pro' is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       PhoneM();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  PhoneM();
                               }
                 //creating object

    }
}
class Laptop extends Electronics
{
  void LaptopM()
  {
     Scanner sc = new Scanner(System.in);
        int sc1;
        Dell DellObj = new Dell();
        hp hpObj = new hp();
        System.out.println("Welcome to my Laptop portal\n"
                + "Select one of these Brands products to buy\n"
                + "1.Dell\n"
                + "2.hp");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                DellObj.DellM(); // calling AppleM by s1
                break;
            default:
                hpObj.hpM();
                break;
        }
  }
}
class Dell extends Laptop {
    void DellM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    Dell XPS 15   \n"
                                +"Here specifications of Dell XPS 15\n"
                                +"\n"
                                +"LAUNCH Announced    ---->2022, june 22\n"
                                +"\n"
                                +"Processor           ---->12th Gen Intel\u00AE Core\u2122 i5-1230U (12 MB cache, 10 cores)\n"
                                +"\n"
                                +"Video Card          ---->Intel\u00AE Iris\u00AE Xe Graphics\n"
                                +"\n"
                                +"Display             ---->13\" 3:2 3K (2880x1920) Touch; AR+AS, GorillaGlass Victus, active pen support, 500-Nit Display\n"
                                +"\n"
                                +"Camera              ---->12 MP, f/1.8, 26mm (wide)\n"
                                +"\n"//
                                +"Memory              ---->16 GB, LPDDR4x, 4267 MHz, integrated\n"
                                +"\n"
                                +"Hard Drive          ---->512 GB, M.2, PCIe NVMe, SSD\n"
                                +"\n"
                                +"\n"
                                +"Price               ---->  1,39,999.00 only/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order 'Dell XPS 15' is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       LaptopM();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  LaptopM();
                               }
                 //creating object

    }
}
class hp extends Laptop {
    void hpM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    HP Envy 360   \n"
                                +"Here specifications of HP Envy 360\n"
                                +"\n"
                                +"LAUNCH Announced    ---->2019, April 03\n"
                                +"\n"
                                +"Processor           ---->12th Gen Intel\u00AE Core\u2122 i9-1230U (16 MB cache, 10 cores)\n"
                                +"\n"
                                +"Video Card          ---->Intel\u00AE Iris\u00AE Xe Graphics\n"
                                +"\n"
                                +"Display             ---->13\" 3:2 3K (2880x1920) Touch; AR+AS, GorillaGlass Victus, active pen support, 500-Nit Display\n"
                                +"\n"
                                +"Camera              ---->5 MP, f/1.8, 26mm (wide)\n" //
                                +"\n"
                                +"Memory              ---->32 GB, LPDDR5x, 4267 MHz, integrated\n"
                                +"\n"
                                +"Hard Drive          ---->512 GB, M.2, PCIe NVMe, SSD\n"
                                +"\n"
                                +""
                                +"Price               ---->  1,89,999.00 only/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order hp is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       LaptopM();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  LaptopM();
                               }
                 //creating object

    }
}
class Smart_watches extends Electronics
{
  void Smart_watchesM()
  {
     Scanner sc = new Scanner(System.in);
        int sc1;
        Noise s1 = new Noise();
        Boat s2 = new Boat();
       // Samsung s2 = new Samsung(); // creating object
        System.out.println("Welcome to my Smart watches portal\n"
                + "Select one of these Brands products to buy\n"
                + "1.Noise\n"
                + "2.Boat");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                s1.NoiseM(); // calling AppleM by s1
                break;
            default:
                s2.BoatM();
                break;
        }
  }
}
class Noise extends Smart_watches {
    void NoiseM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    Noise Fit 4   \n"
                                +"Here specifications of HP Envy 360\n"
                                +"\n"
                                +"LAUNCH Announced           ---->2019, April 03\n"
                                +"\n"
                                +"Sensor                     ---->Heart Rate, Blood Oxygen, Ambient Noise Detection\n"
                                +"\n"
                                +"Battery Life               ---->7 days\n"
                                +"\n"
                                +"Compatible OS              ---->Android & iOS\n"
                                +"\n"
                                +"Display Resolution         ---->240 x 285 pixel\n" //
                                +"\n"
                                +"Warranty Summary           ---->1 Year Manufacturer Warranty\n"
                                +"\n"
                                +"Microphone                 ---->Yes\n"
                                +"\n"
                                +"\n"
                                +"Price                       ---->  2,499.00 only/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order 'Noise Fit 4' is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       Smart_watchesM();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  Smart_watchesM();
                               }
                 //creating object

    }
}
class Boat extends Smart_watches {
    void BoatM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    Boat Wave   \n"
                                +"Here specifications of Boat Wave\n"
                                +"\n"
                                +"LAUNCH Announced           ---->2022, April 13\n"
                                +"\n"
                                +"Sensor                     ---->Heart Rate, Blood Oxygen, Ambient Noise Detection\n"
                                +"\n"
                                +"Battery Life               ---->10 days\n"
                                +"\n"
                                +"Compatible OS              ---->Android & iOS\n"
                                +"\n"
                                +"Display Resolution         ---->240 x 285 pixel\n" //
                                +"\n"
                                +"Warranty Summary           ---->1 Year Manufacturer Warranty\n"
                                +"\n"
                                +"Microphone                 ---->Yes\n"
                                +"\n"
                                +""
                                +"Price               ---->  3,999.00 only/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order Boat Wave is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       Smart_watchesM();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  Smart_watchesM();
                               }
                 //creating object

    }
}
class Speakers extends Electronics
{
  void SpeakersM()
 {
     Scanner sc = new Scanner(System.in);
        int sc1;
        Sony s1 = new Sony();
        Jbl s2 = new Jbl();
       // Samsung s2 = new Samsung(); // creating object
        System.out.println("Welcome to my Speakers portal\n"
                + "Select one of these Brands products to buy\n"
                + "1.Sony S40R Soundbar 600W\n"
                + "2.Jbl");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                s1.SonyM(); // calling AppleM by s1
                break;
            default:
                s2.JblM();
                break;
        }
  }
}
class Sony extends Speakers {
    void SonyM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Sony S40R Soundbar 600W'   \n"
                                +"Here specifications of 'Sony S40R Soundbar 600W'\n"
                                +"\n"
                                +"LAUNCH Announced                 ---->2019, Sep 29\n"
                                +"\n"
                                +"Model Number                     ---->HT-S40R\n"
                                +"\n"
                                +"Power Output (RMS)               ---->600 W\n"
                                +"\n"
                                +"Configuration                    ---->5.1 Channel\n"
                                +"\n"
                                +"Bluetooth                        ---->5.0 withA2DP, AVRCP\n" //
                                +"\n"
                                +"Warranty Summary                 ---->1 Year Manufacturer Warranty\n"
                                +"\n"
                                +"Technology Used                  ---->Dolby Digital\n"
                                +"\n"
                                +""
                                +"Price                            ---->  29,999.00 only/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order 'Sony S40R Soundbar 600W' is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       SpeakersM();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  SpeakersM();
                               }
                 //creating object

    }
}
class Jbl extends Speakers {
    void JblM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'JBL PartyBox 1000'   \n"
                                +"Here specifications of 'JBL PartyBox 1000'\n"
                                +"\n"
                                +"LAUNCH Announced                 ---->2016, Sep 25\n"
                                +"\n"
                                +"Model Number                     ---->Party Box 1000\n"
                                +"\n"
                                +"Power Output (RMS)               ---->1000 W\n"
                                +"\n"
                                +"Configuration                    ---->2.1 Channel\n"
                                +"\n"
                                +"Bluetooth                        ---->5.0 withA2DP, AVRCP\n" //
                                +"\n"
                                +"Warranty Summary                 ---->1 Year Manufacturer Warranty\n"
                                +"\n"
                                +"Technology Used                  ---->Dolby Digital\n"
                                +"\n"
                                +""
                                +"Price                            ---->  90,999.00 only/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order Jbl is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       SpeakersM();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  SpeakersM();
                               }
                 //creating object

    }   //Electronics done
} 
class Fashion extends Products
{
    void FashionMethod() {
        Scanner sc = new Scanner(System.in);
        int sc1;
        Shirt ShirtObj = new Shirt();         //creating object
        Jeans JeansObj = new Jeans();
        Saari saariObj = new Saari();
        // Frock FrockObj = new Frock();  
        System.out.println("Welcome to Electronics portal\n"
                + "Select one of these products to buy\n"
                +"\n"
                + "1.Shirt\n"
                + "2.Jeans\n"
                + "3.Saari\n");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                ShirtObj.ShirtM(); // calling AppleM by s1
                break;
                case 2:
                JeansObj.JeansM(); // calling AppleM by s1
                break;
                // case 3:
                // s1.SaariM(); // calling AppleM by s1
                // break;
            default:
                saariObj.SaariM();
                break;
        }

    }
}
class Shirt extends Fashion
{
  void ShirtM()
  {
     Scanner sc = new Scanner(System.in);
        int sc1;
        Raymond s1 = new Raymond();
        Puma s2 = new Puma();
       // Samsung s2 = new Samsung(); // creating object
        System.out.println("Welcome to my Fashion portal\n"
                + "Select one of these Brands products to buy\n"
                + "1.Raymond\n"
                + "2.Puma");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                s1.RaymondM(); // calling AppleM by s1
                break;
            default:
                s2.PumaM();
                break;
        }
  }
} 
class Raymond extends Shirt {
    void RaymondM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Raymond Men Regular'   \n"
                                +"Here specifications of 'Raymond Men Regular'\n"
                                +"\n"
                                +"\n"
                                +"Fit: Regular Fit\n"
                                +"\n"
                                +"Color: Light Pink \n"
                                +"\n"
                                +"Fabric: 100% COTTON \n"
                                +"\n"
                                +"Neck: Regular Collar\n"
                                +"\n"
                                +"Sleeve: Full Sleeve\n" //
                                +"\n"
                                +"Machine Wash\n"
                                +"\n"
                                +"SKU: #RPSZ07978-R286F038\n"
                                +"\n"
                                +""
                                +"Price                            ---->  2,579.00 only/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order 'Raymond Men Regular' is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FashionMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                 FashionMethod();
                               }
                 //creating object

    }
}  
class Puma extends Shirt {
    void PumaM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'PUMA Men Regular'   \n"
                                +"Here specifications of 'PUMA Men Regular'\n"
                                +"\n"
                                +"Fit: Regular Fit\n"
                                +"\n"
                                +"Color: Light Blue \n"
                                +"\n"
                                +"Fabric: 100% COTTON \n"
                                +"\n"
                                +"Neck: Regular Collar\n"
                                +"\n"
                                +"Sleeve: Full Sleeve\n" //
                                +"\n"
                                +"Machine Wash\n"
                                +"\n"
                                +"SKU: #RPSZ07978-R286F038\n"
                                +"\n"
                                +""
                                +"Price                            ---->  1,567.00 only/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order 'PUMA Men Regular' is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FashionMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  FashionMethod();
                               }
                 //creating object

    }
}   
class Jeans extends Fashion
{
  void JeansM()
  {
     Scanner sc = new Scanner(System.in);
        int sc1;
        Lee s1 = new Lee();
        Pepe s2 = new Pepe();
       // Samsung s2 = new Samsung(); // creating object
        System.out.println("Welcome to my Fashion portal\n"
                + "Select one of these Brands products to buy\n"
                + "1.Lee Cooper\n"
                + "2.Pepe Jeams");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                s1.LeeM(); // calling AppleM by s1
                break;
            default:
                s2.PepeM();
                break;
        }
  }
}  
class Lee extends Jeans {
    void LeeM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Lee Cooper'   \n"
                                +"Here specifications of 'PUMA Men Regular'\n"
                                +"\n"
                                +"\n"
                                +"Care Instructions: Hand Wash Only\n"
                                +"\n"
                                +"Fit Type: Straight\n"
                                +"\n"
                                +"Color name: Beige\n"
                                +"\n"
                                + "Material: Cotton\n"
                                +"\n"
                                +"Pattern: Plain\n"
                                +"\n"
                                +"Hand Wash");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order Lee Coper is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FashionMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  FashionMethod();
                               }
                 //creating object

    }
} 
class Pepe extends Jeans {
    void PepeM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Pepe Jeans'   \n"
                                +"Here specifications of 'PUMA Men Regular'\n"
                                +"\n"
                                +"\n"
                                +"Care Instructions: Hand Wash Only\n"
                                +"\n"
                                +"Fit Type: Straight\n"
                                +"\n"
                                +"Color name: Beige\n"
                                +"\n"
                                + "Material:  100% Cotton\n"
                                +"\n"
                                +"Pattern: Plain\n"
                                +"\n"
                                +"Hand Wash");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order 'Pepe' is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FashionMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  FashionMethod();
                               }
                                                  //Jeans done 

    }
} 
class Saari extends Fashion
{
  void SaariM()
  {
     Scanner sc = new Scanner(System.in);
        int sc1;
        Saari1 s1 = new Saari1();
        Saari2 s2 = new Saari2();
       // Samsung s2 = new Samsung(); // creating object
        System.out.println("Welcome to my Fashion portal\n"
                + "Select one of these Brands products to buy\n"
                + "1.SWORN Saari\n"
                + "2.Banarasi Soft Silk");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                s1.Saari1M(); // calling AppleM by s1
                break;
            default:
                s2.Saari2M();
                break;
        }
  }
}  
class Saari1 extends Saari {
    void Saari1M()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'SWORN Saari'   \n"
                                +"Here specifications of 'SWORN Saari'\n"
                                +"\n"
                                +"\n"
                                +"Saree Color: Pink | Saree Material: Banarasi Silk | Saree Length: 6.3 meter\n"
                                +"\n"
                                +"Blouse details - Blouse Color: Brown | Blouse Material: Banarasi Silk | Blouse Length: 0.8 metert\n"
                                +"\n"
                                +"Border & Pallu details- Border Color: Multicolor | Border Work Type: Floral | Pallu Color: Brown |Pallu\n"
                                +"\n"
                                + "Wash Care: First Wash Dry Clean Recommended; After That Cold Hand Wash Can Be Done\n"
                                +"\n"
                                +"Weave Type: Ethnic Motifs | Include Components: Saree With Unstitched Blouse Piece\n"
                                +"\n"
                                +"Hand Wash");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order SWORN Saari is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FashionMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  FashionMethod();
                               }
                                                  //Jeans done 

    }
}
class Saari2 extends Saari {
    void Saari2M()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Banarasi Soft Silk'   \n"
                                +"Here specifications of 'Banarasi Soft Silk'\n"
                                +"\n"
                                +"Saree Color: Pink | Saree Material: Banarasi Silk | Saree Length: 6.3 meter\n"
                                +"\n"
                                +"Blouse details - Blouse Color: Brown | Blouse Material: Banarasi Silk | Blouse Length: 0.8 metert\n"
                                +"\n"
                                +"Border & Pallu details- Border Color: Multicolor | Border Work Type: Floral | Pallu Color: Brown |Pallu\n"
                                +"\n"
                                + "Wash Care: First Wash Dry Clean Recommended; After That Cold Hand Wash Can Be Done\n"
                                +"\n"
                                +"Weave Type: Ethnic Motifs | Include Components: Saree With Unstitched Blouse Piece\n"
                                +"\n"
                                +"Style : The Texture And Weight Of The Saree Brings Image Prints One Step Closer To The Originals And Invites Attention\n"
                                +"\n"
                                +"Price : 10.999/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order 'Banarasi Soft Silk' is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FashionMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  FashionMethod();
                               }
                                                  //Jeans done 

    }
}   
class Appliances extends Products
{
    void AppliancesMethod() {
        Scanner sc = new Scanner(System.in);
        int sc1;
        Kettle KettleObj = new Kettle();         //creating object
        Cooker CookerObj = new Cooker();
        Fridge FridgeObj = new Fridge();
        Fan FanObj = new Fan();  
        System.out.println("Welcome to Appliances portal\n"
                + "Select one of these products to buy\n"
                +"\n"
                + "1.Kettle\n"
                + "2.Cooker\n"
                + "3.Fridge\n"
                + "4.Fan\n");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
               KettleObj.KettleM(); // calling AppleM by s1
                break;
                case 2:
                CookerObj.CookerM(); // calling AppleM by s1
                break;
                case 3:
                FridgeObj.FridgeM(); // calling AppleM by s1
                break;
            default:
                FanObj.FanM();
                break;
        }

    }
}
class Kettle extends Appliances
{
  void KettleM()
  {
     Scanner sc = new Scanner(System.in);
        int sc1;
        Pegion s1 = new Pegion();
        Usha s2 = new Usha();
       // Samsung s2 = new Samsung(); // creating object
        System.out.println("Welcome to my Appliances portal\n"
                + "Select one of these Brands products to buy\n"
                + "1.Pegion\n"
                + "2.Usha");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                s1.PegionM(); // calling AppleM by s1
                break;
            default:
                s2.UshaM();
                break;
        }
  }
}  
class Pegion extends Kettle {
    void PegionM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Pegion kettle'   \n"
                                +"Here specifications of 'Pegion kettle'\n"
                                +"\n"
                                +"\n"
                                +"CLASSIC DESIGN: The classical mirror polish of the appearance makes your electric kettle unique and aesthetic, which can match any type of kitchen design and 360\n"
                                +"\n"
                                +"CORDLESS POURING: The electric kettle can be easily lifts from its swivel base for easy filling at the sink and graceful serving without the hassle of a power cord\n"
                                +"\n"
                                +"CONVENIENT: The cordless & BPA-Free electric electric kettle makes a striking presence on any kitchen counter or buffet in preparing and serving and it is easy for storage\n"
                                +"\n"
                                +"FAST BOIL: This 1500W electric kettle has concealed heating elements and can boil up to 1.5 litres of water in 5 to 7 minutes, quicker and safer.green tea, hot water\n"
                                +"\n"
                                +"Weave Type: Ethnic Motifs | Include Components: Saree With Unstitched Blouse Piece\n"
                                +"\n"
                                +"EASY CLEAN: Use white vinegar, baking soda, water, cleaning bottle brush and microfiber cloth to clean your electric kettle and keep it looking new.\n"
                                +"\n"
                                +"Price : 3.999/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order Pegion kettle is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       AppliancesMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  AppliancesMethod();
                               }
                                                  //Jeans done 

    }
}
class Usha extends Kettle {
    void UshaM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'USHA kettle'   \n"
                                +"Here specifications of 'USHA kettle'\n"
                                +"\n"
                                +"\n"
                                +"CLASSIC DESIGN: The classical mirror polish of the appearance makes your electric kettle unique and aesthetic, which can match any type of kitchen design and 360\n"
                                +"\n"
                                +"CORDLESS POURING: The electric kettle can be easily lifts from its swivel base for easy filling at the sink and graceful serving without the hassle of a power cord\n"
                                +"\n"
                                +"CONVENIENT: The cordless & BPA-Free electric electric kettle makes a striking presence on any kitchen counter or buffet in preparing and serving and it is easy for storage\n"
                                +"\n"
                                +"FAST BOIL: This 2000W electric kettle has concealed heating elements and can boil up to 1.5 litres of water in 5 to 7 minutes, quicker and safer.green tea, hot water\n"
                                +"\n"
                                +"Weave Type: Ethnic Motifs | Include Components: Saree With Unstitched Blouse Piece\n"
                                +"\n"
                                +"EASY CLEAN: Use white vinegar, baking soda, water, cleaning bottle brush and microfiber cloth to clean your electric kettle and keep it looking new.\n"
                                +"\n"
                                +"Price : 2.999/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order 'Usha Kettle' is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       AppliancesMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  AppliancesMethod();
                               }
                                                  //Jeans done 

    }
}
class Cooker extends Appliances
{
  void CookerM()
  {
     Scanner sc = new Scanner(System.in);
        int sc1;
        Hawkins s1 = new Hawkins();
        Prestige s2 = new Prestige();
       // Samsung s2 = new Samsung(); // creating object
        System.out.println("Welcome to my Appliances portal\n"
                + "Select one of these Brands products to buy\n"
                + "1.Hawkins\n"
                + "2.Prestige");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                s1.HawkinsM(); // calling AppleM by s1
                break;
            default:
                s2.PrestigeM();
                break;
        }
  }
} 
class Hawkins extends Cooker {
    void HawkinsM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Hawkins Cooker'   \n"
                                +"Here specifications of 'Hawkins Cooker'\n"
                                +"\n"
                                +"\n"
                                +"Ideal for 5 to 7 Persons\n"
                                +"\n"
                                +"Xtra Thick body - 4.88 mm thick base - Base stays flat, will not bulge\n"
                                +"\n"
                                +"Cooks quickly and evenly\n"
                                +"\n"
                                +"Base stays flat, will not bulge\n"
                                +"\n"
                                +"Heats evenly all over; retains heat well\n"
                                +"\n"
                                +"\n"
                                +"Price : 5,999/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order Hawkins Cooker is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       AppliancesMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  AppliancesMethod();
                               }
                                                  //Jeans done 

    }
} 
class Prestige extends Cooker {
    void PrestigeM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Prestige Cooker'   \n"
                                +"Here specifications of 'Prestige Cooker'\n"
                                +"\n"
                                +"\n"
                                +"Ideal for 5 to 7 Persons\n"
                                +"\n"
                                +"Xtra Thick body - 4.88 mm thick base - Base stays flat, will not bulge\n"
                                +"\n"
                                +"Cooks quickly and evenly\n"
                                +"\n"
                                +"Base stays flat, will not bulge\n"
                                +"\n"
                                +"Heats evenly all over; retains heat well\n"
                                +"\n"
                                +"\n"
                                +"Price : 3,799/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order Prestige Cooker is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       AppliancesMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  AppliancesMethod();
                               }
                                                  //Jeans done 

    }
}  
class Fridge extends Appliances
{
  void FridgeM()
  {
     Scanner sc = new Scanner(System.in);
        int sc1;
        Bosh s1 = new Bosh();
        Haier s2 = new Haier();
       // Samsung s2 = new Samsung(); // creating object
        System.out.println("Welcome to my Appliances portal\n"
                + "Select one of these Brands products to buy\n"
                + "1.BOSH\n"
                + "2.Haier");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                s1.BoshM(); // calling AppleM by s1
                break;
            default:
                s2.HaierM();
                break;
        }
  }
}
class Bosh extends Fridge {
    void BoshM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'BOSH Fridge'   \n"
                                +"Here specifications of 'BOSH Fridge'\n"
                                +"\n"
                                +"\n"
                                +"Side By Side Frost-Free Refrigerators: : With Convertible 5in1 mode best optimize your storage needs || Normal Mode | Seasonal Mode| Extra Fridge Mode | Vacation Mode | Home Alone Mode\n"
                                +"\n"
                                +"Capacity : 653 Liters: Suitable For Families With 5 Or More Members\n"
                                +"\n"
                                +"Digital Inverter Compressor : Automatic Adjustment Of Speed In Response To Cooling Demand\n"
                                +"\n"
                                +"Digital Inverter Compressor : Enjoy greater energy efficiency, less noise and a long-lasting performance. Consumes 50% less power, backed up by 20 year warranty\n"
                                +"\n"
                                +"Twin Cooling Plus : Ensures food stays fresh and moist longer.\n"
                                +"\n"
                                +"\n"
                                +"Price : 1,30,799/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order BOSh Fridge is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       AppliancesMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  AppliancesMethod();
                               }
                                                  //Jeans done 

    }
}  
class Haier extends Fridge {
    void HaierM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Haier Fridge'   \n"
                                +"Here specifications of 'Haier Fridge'\n"
                                +"\n"
                                +"\n"
                                +"Side By Side Frost-Free Refrigerators: : With Convertible 5in1 mode best optimize your storage needs\n"
                                +"\n"
                                +"Capacity : 853 Liters: Suitable For Families With 5 Or More Members\n"
                                +"\n"
                                +"Digital Inverter Compressor : Automatic Adjustment Of Speed In Response To Cooling Demand\n"
                                +"\n"
                                +"Digital Inverter Compressor : Enjoy greater energy efficiency. Consumes 50% less power, backed up by 20 year warranty\n"
                                +"\n"
                                +"Twin Cooling Plus : Ensures food stays fresh and moist longer.\n"
                                +"\n"
                                +"Manufacturer warranty : 1 year on product, 20 years on compressor\n"
                                +"\n"
                                +"\n"
                                +"Price : 1,30,799/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order Haier  is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       AppliancesMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  AppliancesMethod();
                               }
                                                  //Jeans done 

    }
}
class Fan extends Appliances
{
  void FanM()
  {
     Scanner sc = new Scanner(System.in);
        int sc1;
        Orient s1 = new Orient();
        Havells s2 = new Havells();
       // Samsung s2 = new Samsung(); // creating object
        System.out.println("Welcome to my Appliances portal\n"
                + "Select one of these Brands products to buy\n"
                + "1.Orient\n"
                + "2.Usha");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                s1.OrientM(); // calling AppleM by s1
                break;
            default:
                s2.HavellsM();
                break;
        }
  }
}
class Orient extends Fan {
    void OrientM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Orient Fan 1200mm'   \n"
                                +"Here specifications of 'Orient Fan 1200mm'\n"
                                +"\n"
                                +"INTELLIGENT BLDC MOTOR: Energy-efficient motor consumes only 26 W of energy at the highest speed; being a 5-star rated fan\n"
                                +"\n"
                                +"NOISELESS MOTOR OPERATION: Enjoy silent operation of fan through intelligent BLDC motor\n"
                                +"\n"
                                +"INVERTER STABILIZATION TECHNOLOGY: Runs consistently at the same speed even at low and fluctuating voltages between 140-270 W\n"
                                +"\n"
                                +"SMART REMOTE FOR EASE OF OPERATION: Control your fan at the click of a button! Orient\n"
                                +"\n"
                                +"HIGH SPEED & AIR FLOW: I-Tome operates at a high speed of 370 RPM with air delivery of 220 CMM\n"
                                +"\n"
                                +"3 YR ON-SITE WARRANTY: Orient I-Tome comes with a 3 year on-site manufacturer\u2019s warranty\n"
                                +"\n"
                                +"\n"
                                +"Price : 3,549/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order Orient 1200mm Fan is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       AppliancesMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  AppliancesMethod();
                               }
                                                  //Jeans done 

    }
} 
class Havells extends Fan {
    void HavellsM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Havells Fan 1200mm'   \n"
                                +"Here specifications of 'Havells Fan 1200mm'\n"
                                +"\n"
                                +"INTELLIGENT BLDC MOTOR TO SAVE UPTO INR 7000 ANNUALLY: Energy-efficient motor consumes only 26 W of energy at the highest speed\n"
                                +"\n"
                                +"NOISELESS MOTOR OPERATION: Enjoy silent operation of fan through intelligent BLDC motor\n"
                                +"\n"
                                +"INVERTER STABILIZATION TECHNOLOGY: Runs consistently at the same speed even at low and fluctuating voltages between 140-270 W\n"
                                +"\n"
                                +"SMART REMOTE FOR EASE OF OPERATION: Orient\u2019s smart remote comes with 5 speed settings and smart features like Boost mode and Timer functionality for 2, 4, 6 and 8 hours\n"
                                +"\n"
                                +"HIGH SPEED & AIR FLOW: I-Tome operates at a high speed of 370 RPM with air delivery of 220 CMM\n"
                                +"\n"
                                +"3 YR ON-SITE WARRANTY: Orient I-Tome comes with a 3 year on-site manufacturer\u2019s warranty\n"
                                +"\n"
                                +"\n"
                                +"Price : 4,549/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order Havells 1200mm is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       AppliancesMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  AppliancesMethod();
                               }
                                                  //Jeans done 

    }
}
class Furniture extends Products
{
    void FurnitureMethod() {
        Scanner sc = new Scanner(System.in);
        int sc1;
        Bed BedObj = new Bed();         //creating object
        Table TableObj = new Table();
        Sofa SofaObj = new Sofa();
        System.out.println("Welcome to Furniture portal\n"
                + "Select one of these products to buy\n"
                +"\n"
                + "1.Bed\n"
                + "2.Table\n"
                + "3.Sofa\n");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                BedObj.BedM(); // calling AppleM by s1
                break;
                case 2:
                TableObj.TableM(); // calling AppleM by s1
                break;
            default:
                SofaObj.SofaM();
                break;
        }

    }
} 
class Bed extends Furniture
{
  void BedM()
  {
     Scanner sc = new Scanner(System.in);
        int sc1;
        Singlebed s1 = new Singlebed();
        Doublebed s2 = new Doublebed();
       // Samsung s2 = new Samsung(); // creating object
        System.out.println("Welcome to my Appliances portal\n"
                + "Select one of these Brands products to buy\n"
                + "1.Singlebed\n"
                + "2.Doublebed");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                s1.SinglebedM(); // calling AppleM by s1
                break;
            default:
                s2.DoublebedM();
                break;
        }
  }
}
class Singlebed extends Bed {
    void SinglebedM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Singlebed'   \n"
                                +"Here specifications of 'Singlebed'\n"
                                +"\n"
                                +"\n"
                                +"Item Dimensions: Length 100 cm X Width 190 cm X Height 34.5 cm\n"
                                +"\n"
                                +"Material: Made with Sheesham Wood, with a Honey Finish.\n"
                                +"\n"
                                +"Mattress size: 36 inches x 72 inches\n"
                                +"\n"
                                +"Is assembly required: Yes, assembled by Amazon\n"
                                +"\n"
                                +"Warranty Description: 3 years warranty against manufacturing defects\n"
                                +"\n"
                                +"Style: The product design is inspired by the graceful arches of historic Indian design.\n"
                                +"\n"
                                +"\n"
                                +"Price : 8,549/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order Singlebed is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FurnitureMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  FurnitureMethod();
                               }
                                                  //Jeans done 

    }
} 
class Doublebed extends Bed {
    void DoublebedM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Doublebed'   \n"
                                +"Here specifications of 'Doublebed'\n"
                                +"\n"
                                +"Item Dimensions: Length 200 cm X Width 490 cm X Height 34.5 cm\n"
                                +"\n"
                                +"Material: Made with Sheesham Wood, with a Honey Finish.\n"
                                +"\n"
                                +"Mattress size: 76 inches x 162 inches\n"
                                +"\n"
                                +"Is assembly required: Yes, assembled by Amazon\n"
                                +"\n"
                                +"Warranty Description: 3 years warranty against manufacturing defects\n"
                                +"\n"
                                +"Style: The product design is inspired by the graceful arches of historic Indian design.\n"
                                +"\n"
                                +"\n"
                                +"Price : 8,549/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order Doublebed is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FurnitureMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  FurnitureMethod();
                               }
                                                  //Jeans done 

    }
}
class Table extends Furniture
{
  void TableM()
  {
     Scanner sc = new Scanner(System.in);
        int sc1;
        StudyTable s1 = new StudyTable();
        GamingTable s2 = new GamingTable();
       // Samsung s2 = new Samsung(); // creating object
        System.out.println("Welcome to my Furniture portal\n"
                + "Select one of these Brands products to buy\n"
                + "1.StudyTable\n"
                + "2.GamingTable");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                s1.StudyTableM(); // calling AppleM by s1
                break;
            default:
                s2.GamingTableM();
                break;
        }
  }
}
class StudyTable extends Table {
    void StudyTableM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'StudyTable'   \n"
                                +"Here specifications of 'StudyTable'\n"
                                +"\n"
                                +"Large Size - 120Cms (Wide) X 60 Cms (Deep) X 75 Cms (High) Offers You A Large And Efficient Space To Work\n"
                                +"\n"
                                +"Robust Design - Table Top Is Premium Particle Board (High Grade Prelaminated Engineering Wood With Natural Wood Grain Finish)\n"
                                +"\n"
                                +"Worry Free 1 Year Warranty - A 12 Month Warranty Any Against Kind Of Manufacturing Defects\n"
                                +"\n"
                                +"Is assembly required: Yes, assembled by Amazon\n"
                                +"\n"
                                +"Warranty Description: 3 years warranty against manufacturing defects\n"
                                +"\n"
                                +"Versatility - With Modern Sleek Design, The Computer Table Can Suit Any Home, Office Dorm, School And Workspace. Wide Desktop Provides Ample Space For Computer.\n"
                                +"\n"
                                +"\n"
                                +"Price : 4,629.00/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order StudyTable is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FurnitureMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  FurnitureMethod();
                               }
                                                  //Jeans done 

    }
} 
class GamingTable extends Table {
    void GamingTableM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'GamingTable'   \n"
                                +"Here specifications of 'GamingTable'\n"
                                +"\n"
                                +"Large Size - 120Cms (Wide) X 60 Cms (Deep) X 75 Cms (High) Offers You A Large And Efficient Space To Work\n"
                                +"\n"
                                +"Robust Design - Table Top Is Premium Particle Board (High Grade Prelaminated Engineering Wood With Natural Wood Grain Finish)\n"
                                +"\n"
                                +"Worry Free 1 Year Warranty - A 12 Month Warranty Any Against Kind Of Manufacturing Defects\n"
                                +"\n"
                                +"Is assembly required: Yes, assembled by Amazon\n"
                                +"\n"
                                +"Warranty Description: 3 years warranty against manufacturing defects\n"
                                +"\n"
                                +"Versatility - With Modern Sleek Design, The Computer Table Can Suit Any Home, Office Dorm, School And Workspace. Wide Desktop Provides Ample Space For Computer.\n"
                                +"\n"
                                +"\n"
                                +"Price : 9,629.00/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order GamingTable is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FurnitureMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  FurnitureMethod();
                               }
                                                  //Jeans done 

    }
}
class Sofa extends Furniture
{
  void SofaM()
  {
     Scanner sc = new Scanner(System.in);
        int sc1;
        Lshaped s1 = new Lshaped();
        Regular s2 = new Regular();
       // Samsung s2 = new Samsung(); // creating object
        System.out.println("Welcome to my Furniture portal\n"
                + "Select one of these Brands products to buy\n"
                + "1.Lshaped\n"
                + "2.Regular");
        sc1 = sc.nextInt();

        switch (sc1) {
            case 1:
                s1.LshapedM(); // calling AppleM by s1
                break;
            default:
                s2.RegularM();
                break;
        }
  }
}
class Lshaped extends Sofa {
    void LshapedM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Lshaped Sofa'   \n"
                                +"Here specifications of 'Lshaped Sofa'\n"
                                +"\n"
                                +"Perfect SIZE: The size of the sectional sofa is: Couch size: 106.3\"*48.8\"*34.2\", the weight capacity for each seat is 300 lbs. The couch can allow 4 people to sit on\n"
                                +"\n"
                                +"HIGH QUALITY upholestery with slightly, Colour :Light Grey\n"
                                +"\n"
                                +"BLACK OAK is a unique, independent design store, which produces and retails premium quality\n"
                                +"\n"
                                +"Is assembly required: Yes, assembled by Amazon\n"
                                +"\n"
                                +"Warranty Description: 3 years warranty against manufacturing defects\n"
                                +"\n"
                                +"BLACK OAK team distinguishes itself in its commitment to be personally involved in the customer\u2019s selection process.\n"
                                +"\n"
                                +"\n"
                                +"Price : 79,899.00/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order Lshaped is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FurnitureMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  FurnitureMethod();
                               }
                                                  //Jeans done 

    }
}  
class Regular extends Sofa {
    void RegularM()
    {       
            int Xr;
            int Xr1;
            Scanner sc = new Scanner(System.in);
            System.out.println("    'Regular Sofa'   \n"
                                +"Here specifications of 'Regular Sofa'\n"
                                +"\n"
                                +"Perfect SIZE ---->The size of the sectional sofa is: Couch size: 106.3\"*48.8\"*34.2\n"
                                +"\n"
                                +"HIGH QUALITY upholestery with slightly, Colour :Light Grey\n"
                                +"\n"
                                +"BLACK OAK is a unique, independent design store, which produces and retails premium quality, contemporary furniture.\n"
                                +"\n"
                                +"Is assembly required: Yes, assembled by Amazon\n"
                                +"\n"
                                +"Warranty Description: 3 years warranty against manufacturing defects\n"
                                +"\n"
                                +"BLACK OAK team distinguishes itself in its commitment to be personally involved in the customer\u2019s selection process.\n"
                                +"\n"
                                +"\n"
                                +"Price : 99,899.00/-");
            
            System.out.println("Press 1 to buy this product\n"
                               +"Press 2 to exit");
                                Xr=sc.nextInt();

                               if(Xr==1)
                               {
                                 System.out.println("Your order Regul Sofa is confirmed !!! THANKS for shopping !!!\n"
                                                    +""
                                                    +"press 1 to exit\n"
                                                    +"press 2 to go to main menu");
                                                    Xr1=sc.nextInt();
                                                    if(Xr1==1)
                                                    {
                                                       FurnitureMethod();
                                                    }  
                                                    else
                                                    {
                                                       ProductsM();
                                                    }         
                               }
                               else
                               {
                                  FurnitureMethod();
                               }
                                                  //Jeans done 

    }
}                                                       
class UjjwalProject1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          Products ProductsObj = new Products();
          ProductsObj.ProductsM();
    }
}
