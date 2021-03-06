package gym;

import java.util.Date;
import java.util.Scanner;

/**
 * Classe pour mettre à jour les informations d'un professionnel. Elle demande le numéro du professionnel puis
 * l'utilisateur fait un choix du champ à modifier puis le modifie.
 * Implémente l'interface Action.
 */
public class ProUpdate implements Action {
	@Override
	public String getTitle() {
		return "Mise à jour des données d'un professionnel";
	}

	@Override
	public void launch() {
		Scanner in = new Scanner(System.in);

		System.out.println("- Mise à jour des données d'un professionnel -");
		System.out.println();

		System.out.println("Entrez le numéro du professionnel");
		Member professionnel = InputReader.askExistingMemberLoop(in);

		System.out.println("Choisissez la donnée que vous souhaitez modifier");
		System.out.println();

		System.out.println("0 - Prénom");
		System.out.println("1 - Nom");
		System.out.println("2 - Date de naissance");
		System.out.println("3 - Genre");
		System.out.println("4 - Numéro de téléphone");
		System.out.println("5 - Email");
		System.out.println("6 - Addresse");
		System.out.println("7 - Ville");
		System.out.println("8 - Province");
		System.out.println("9 - Code postal");

		//Selection
		int select = InputReader.askIntLoop(in, 6);

		switch(select) {
			case 0:
				System.out.println("Entrez son nouveau prénom");
				String firstName = in.nextLine();
				professionnel.setFirstName(firstName);
				break;
			case 1:
				System.out.println("Entrez son nouveau nom");
				String lastName = InputReader.askStringUnderLimitLoop(in, 25);
				professionnel.setLastName(lastName);
				break;
			case 2:
				System.out.println("Entrez sa nouvelle date de naissance (dd-MM-yyyy)");
				Date date = InputReader.askDateLoop(in, "dd-MM-yyyy");
				professionnel.setDateOfBirth(date);
				break;
			case 3:
				System.out.println("Entrez son nouveau genre (M, F ou AUTRE)");
				String gender = InputReader.askGenderLoop(in);
				professionnel.setGender(gender);
				break;
			case 4:
				System.out.println("Entrez son nouveau numéro de téléphone");
				String phoneNumber = in.nextLine();
				professionnel.setPhoneNumber(phoneNumber);
				break;
			case 5:
				System.out.println("Entrez son nouveau email");
				String mail = in.nextLine();
				professionnel.setMail(mail);
				break;
			case 6:
				System.out.println("Entrez sa nouvelle addresse");
				String address = InputReader.askStringUnderLimitLoop(in, 25);
				professionnel.setAddress(address);
				break;
			case 7:
				System.out.println("Entrez sa nouvelle ville");
				String city = InputReader.askStringUnderLimitLoop(in, 14);
				professionnel.setCity(city);
				break;
			case 8:
				System.out.println("Entrez sa nouvelle province");
				String province = InputReader.askStringUnderLimitLoop(in, 2);
				professionnel.setProvince(province);
				break;
			case 9:
				System.out.println("Entrez son nouveau code postal");
				String codePostal = InputReader.askStringUnderLimitLoop(in, 6);
				professionnel.setCodePostal(codePostal);
				break;
		}

		System.out.println("Modification effectuée");
	}
}